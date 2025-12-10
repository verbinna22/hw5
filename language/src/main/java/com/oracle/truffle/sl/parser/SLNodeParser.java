/*
 * Copyright (c) 2022, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.sl.parser;

import java.math.BigInteger;
import java.util.*;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.sl.nodes.*;
import com.oracle.truffle.sl.nodes.expression.*;
import com.oracle.truffle.sl.nodes.local.*;
import com.oracle.truffle.sl.nodes.patterns.*;
import com.oracle.truffle.sl.runtime.SLContext;
import com.oracle.truffle.sl.runtime.SLSexp;
import com.oracle.truffle.sl.runtime.SLStrings;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.SLLanguage;
import com.oracle.truffle.sl.nodes.controlflow.SLFunctionBodyNode;;
import com.oracle.truffle.sl.nodes.util.SLUnboxNodeGen;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ArithmeticContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.BlockContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ExpressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.FunctionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Logic_factorContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Logic_termContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberAssignContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberCallContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberIndexContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Member_expressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.NameAccessContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.NumericLiteralContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ParenExpressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.StringLiteralContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.TermContext;

/**
 * SL AST visitor that parses to Truffle ASTs.
 */
public class SLNodeParser extends SLBaseParser {

    public static Map<TruffleString, RootCallTarget> parseSL(SLLanguage language, Source source) {
        SLNodeParser visitor = new SLNodeParser(language, source);
        parseSLImpl(source, visitor);
        return visitor.functions;
    }

    private FrameDescriptor.Builder frameDescriptorBuilder;

    private SLExpressionVisitor expressionVisitor = new SLExpressionVisitor();
    private int loopDepth = 0;
    private final Map<TruffleString, RootCallTarget> functions = new HashMap<>();
    private int maxGlobalId = 0;
    private final Map<TruffleString, Integer> globalToId = new HashMap<>();
    private boolean mainBlockVisited = false;
    private final Map<TruffleString, List<TruffleString>> funcToNonLocals = new HashMap<>();

    protected SLNodeParser(SLLanguage language, Source source) {
        super(language, source);
    }

    @Override
    public Void visitBlock(SimpleLanguageParser.BlockContext ctx) { // add main
        if (mainBlockVisited) return visitChildren(ctx);
        mainBlockVisited = true;
        TruffleString functionName = SLStrings.MAIN;

        var exprStart = ctx.expression().getStart();
        int functionStartPos;
        if (exprStart != null) {
            functionStartPos = exprStart.getStartIndex();
        } else {
            functionStartPos = 0;
        }
        frameDescriptorBuilder = FrameDescriptor.newBuilder();
        List<SLExpressionNode> methodNodes = new ArrayList<>();

        enterMainFunction();

        SLBlockExpression bodyNode = (SLBlockExpression) expressionVisitor.visitMainBlock(ctx);

        exitFunction();

        methodNodes.addAll(bodyNode.getExpression());
        final int bodyEndPos = bodyNode.getSourceEndIndex();
        final SourceSection functionSrc = source.createSection(functionStartPos, bodyEndPos - functionStartPos);
        final SLExpressionNode methodBlock = new SLBlockExpression(methodNodes.toArray(new SLExpressionNode[methodNodes.size()]));
        methodBlock.setSourceSection(functionStartPos, bodyEndPos - functionStartPos);

        final SLFunctionBodyNode functionBodyNode = new SLFunctionBodyNode(methodBlock);
        functionBodyNode.setSourceSection(functionSrc.getCharIndex(), functionSrc.getCharLength());

        final SLRootNode rootNode = new SLAstRootNode(language, frameDescriptorBuilder.build(), functionBodyNode, functionSrc, functionName);
        functions.put(functionName, rootNode.getCallTarget());

        frameDescriptorBuilder = null;

        return visitChildren(ctx);
    }

    @Override
    public Void visitFunction(FunctionContext ctx) {

        Token nameToken = ctx.IDENTIFIER(0).getSymbol();

        TruffleString functionName = asTruffleString(nameToken, false);

        int functionStartPos = nameToken.getStartIndex();
        frameDescriptorBuilder = FrameDescriptor.newBuilder();
        List<SLExpressionNode> methodNodes = new ArrayList<>();

        int parameterCount = enterFunction(ctx).size();

        for (int i = 0; i < parameterCount; i++) {
            Token paramToken = ctx.IDENTIFIER(i + 1).getSymbol();

            TruffleString paramName = asTruffleString(paramToken, false);
            int localIndex = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, paramName, null);
            assert localIndex == i;

            final SLReadArgumentNode readArg = new SLReadArgumentNode(i);
            readArg.setSourceSection(paramToken.getStartIndex(), paramToken.getText().length());
            SLExpressionNode assignment = createAssignment(createString(paramToken, false), readArg, i);
            methodNodes.add(assignment);
        }

        SLBlockExpression bodyNode = (SLBlockExpression) expressionVisitor.visitBlock(ctx.body);

        exitFunction();

        methodNodes.addAll(bodyNode.getExpression());
        final int bodyEndPos = bodyNode.getSourceEndIndex();
        final SourceSection functionSrc = source.createSection(functionStartPos, bodyEndPos - functionStartPos);
        final SLExpressionNode methodBlock = new SLBlockExpression(methodNodes.toArray(new SLExpressionNode[methodNodes.size()]));
        methodBlock.setSourceSection(functionStartPos, bodyEndPos - functionStartPos);

        final SLFunctionBodyNode functionBodyNode = new SLFunctionBodyNode(methodBlock);
        functionBodyNode.setSourceSection(functionSrc.getCharIndex(), functionSrc.getCharLength());

        final SLRootNode rootNode = new SLAstRootNode(language, frameDescriptorBuilder.build(), functionBodyNode, functionSrc, functionName);
        functions.put(functionName, rootNode.getCallTarget());

        frameDescriptorBuilder = null;

        return visitChildren(ctx);
    }

    private SLStringLiteralNode createString(Token name, boolean removeQuotes) {
        SLStringLiteralNode node = new SLStringLiteralNode(asTruffleString(name, removeQuotes));
        node.setSourceSection(name.getStartIndex(), name.getStopIndex() - name.getStartIndex() + 1);
        return node;
    }

    private class SLExpressionVisitor extends SimpleLanguageBaseVisitor<SLExpressionNode> {
        @Override
        public SLExpressionNode visitBlock(BlockContext ctx) {
            List<TruffleString> newLocals = enterBlock(ctx);

            for (TruffleString newLocal : newLocals) {
                frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, newLocal, null);
            }


            int startPos;
            int endPos;

            var startToken = ctx.getStart();
            var endToken = ctx.getStop();
            if (startToken == null || endToken == null) {
                startPos = endPos = 0;
            } else {
                startPos = startToken.getStartIndex();
                endPos = endToken.getStopIndex();
            }

            List<SLExpressionNode> bodyNodes = new ArrayList<>();

            if (ctx.expression() != null) {
                bodyNodes.add(expressionVisitor.visitExpression(ctx.expression()));
            } else {
                bodyNodes.add(new SLSkipExpression());
            }

            for (var definition : ctx.def().reversed()) {
                var variableDefinition = definition.varSingleLineDef();
                if (variableDefinition != null) {
                    for (var variable : variableDefinition.varSingleDef().reversed()) {
                        if (variable.or_term() != null) {
                            var varToken = variable.IDENTIFIER().getSymbol();
                            var valueNode = expressionVisitor.visitOr_term(variable.or_term());
                            var result = createAssignment(createString(varToken, false), valueNode, null);
                            bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                        }
                    }
                }
            }

            exitBlock();

            List<SLExpressionNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
            flattenBlocks(bodyNodes, flattenedNodes);
            int n = flattenedNodes.size();
            for (int i = 0; i < n; i++) {
                SLStatementNode statement = flattenedNodes.get(i);
                if (statement.hasSource() && !isHaltInCondition(statement)) {
                    statement.addStatementTag();
                }
            }
            SLBlockExpression blockNode = new SLBlockExpression(flattenedNodes.toArray(new SLExpressionNode[flattenedNodes.size()]));
            if (endPos - startPos > 0) {
                blockNode.setSourceSection(startPos, endPos - startPos);
            } else {
                blockNode.setSourceSection(startPos, 0);
            }
            return blockNode;
        }

        public SLExpressionNode visitMainBlock(BlockContext ctx) {
            List<Token> variables = new ArrayList<>();
            for (var definition : ctx.def()) {
                var variableContext = definition.varSingleLineDef();
                if (variableContext != null) {
                    for (var variable : variableContext.varSingleDef()) {
                        variables.add(variable.IDENTIFIER().getSymbol());
                    }
                }
            }
            for (Token tok : variables) {
                TruffleString name = asTruffleString(tok, false);
                if (!globalToId.containsKey(name)) {
                    globalToId.put(name, maxGlobalId++);
                } else {
                    semErr(tok, tok.getText() + " variable redefinition");
                }
            }

            int startPos;
            int endPos;

            var startToken = ctx.getStart();
            var endToken = ctx.getStop();
            if (startToken == null || endToken == null) {
                startPos = endPos = 0;
            } else {
                startPos = startToken.getStartIndex();
                endPos = endToken.getStopIndex();
            }

            List<SLExpressionNode> bodyNodes = new ArrayList<>();

            if (ctx.expression() != null) {
                bodyNodes.add(expressionVisitor.visitExpression(ctx.expression()));
            } else {
                bodyNodes.add(new SLSkipExpression());
            }

            SLContext.get(bodyNodes.get(0)).globalsObject.globals = new Object[maxGlobalId];

            for (var definition : ctx.def().reversed()) {
                var variableDefinition = definition.varSingleLineDef();
                if (variableDefinition != null) {
                    for (var variable : variableDefinition.varSingleDef().reversed()) {
                        if (variable.or_term() != null) {
                            var varToken = variable.IDENTIFIER().getSymbol();
                            var valueNode = expressionVisitor.visitOr_term(variable.or_term());
                            var result = createAssignment(createString(varToken, false), valueNode, null);
                            bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                        }
                    }
                }
            }

            List<SLExpressionNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
            flattenBlocks(bodyNodes, flattenedNodes);
            int n = flattenedNodes.size();
            for (int i = 0; i < n; i++) {
                SLStatementNode statement = flattenedNodes.get(i);
                if (statement.hasSource() && !isHaltInCondition(statement)) {
                    statement.addStatementTag();
                }
            }
            SLBlockExpression blockNode = new SLBlockExpression(flattenedNodes.toArray(new SLExpressionNode[flattenedNodes.size()]));
            if (endPos - startPos > 0) {
                blockNode.setSourceSection(startPos, endPos - startPos);
            } else {
                blockNode.setSourceSection(startPos, 0);
            }
            return blockNode;
        }

        private void flattenBlocks(Iterable<? extends SLExpressionNode> bodyNodes, List<SLExpressionNode> flattenedNodes) {
            for (SLExpressionNode n : bodyNodes) {
                if (n instanceof SLBlockExpression) {
                    flattenBlocks(((SLBlockExpression) n).getExpression(), flattenedNodes);
                } else {
                    flattenedNodes.add(n);
                }
            }
        }

        @Override
        public SLExpressionNode visitSkip_expression(SimpleLanguageParser.Skip_expressionContext ctx) {
            var skip = new SLSkipExpression();
            int start = ctx.getStart().getStartIndex();
            int length = ctx.getStop().getStopIndex() - start;
            skip.setSourceSection(start, length);
            return skip;
        }

        @Override
        public SLExpressionNode visitWhile_expression(SimpleLanguageParser.While_expressionContext ctx) {
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);
            loopDepth++;
            SLStatementNode bodyNode = expressionVisitor.visitBlock(ctx.body);
            loopDepth--;

            conditionNode.addStatementTag();
            final int start = ctx.w.getStartIndex();
            final int end = bodyNode.getSourceEndIndex();
            final SLWhileExpression whileNode = new SLWhileExpression(conditionNode, bodyNode);
            whileNode.setSourceSection(start, end - start);
            return whileNode;
        }

        @Override
        public SLExpressionNode visitDo_while_expression(SimpleLanguageParser.Do_while_expressionContext ctx) {
            List<TruffleString> newLocals = enterBlock(ctx.body);

            for (TruffleString newLocal : newLocals) {
                frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, newLocal, null);
            }


            int startPos;
            int endPos;

            var startToken = ctx.getStart();
            var endToken = ctx.getStop();
            if (startToken == null || endToken == null) {
                startPos = endPos = 0;
            } else {
                startPos = startToken.getStartIndex();
                endPos = endToken.getStopIndex();
            }

            List<SLExpressionNode> bodyNodes = new ArrayList<>();
            // ---
            loopDepth++;
            SLStatementNode bodyExprNode = (ctx.body.expression() == null) ? new SLSkipExpression() : expressionVisitor.visitExpression(ctx.body.expression());
            loopDepth--;
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);

            conditionNode.addStatementTag();
            final int start = ctx.d.getStartIndex();
            final int end = bodyExprNode.getSourceEndIndex();
            final SLDoWhileExpression doWhileNode = new SLDoWhileExpression(conditionNode, bodyExprNode);
            if (end - start > 0) {
                doWhileNode.setSourceSection(start, end - start);
            } else {
                doWhileNode.setSourceSection(start, 0);
            }
            // ---

            bodyNodes.add(doWhileNode);

            for (var definition : ctx.body.def().reversed()) {
                var variableDefinition = definition.varSingleLineDef();
                if (variableDefinition != null) {
                    for (var variable : variableDefinition.varSingleDef().reversed()) {
                        if (variable.or_term() != null) {
                            var varToken = variable.IDENTIFIER().getSymbol();
                            var valueNode = expressionVisitor.visitOr_term(variable.or_term());
                            var result = createAssignment(createString(varToken, false), valueNode, null);
                            bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                        }
                    }
                }
            }

            exitBlock();

            List<SLExpressionNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
            flattenBlocks(bodyNodes, flattenedNodes);
            int n = flattenedNodes.size();
            for (int i = 0; i < n; i++) {
                SLStatementNode statement = flattenedNodes.get(i);
                if (statement.hasSource() && !isHaltInCondition(statement)) {
                    statement.addStatementTag();
                }
            }
            SLBlockExpression blockNode = new SLBlockExpression(flattenedNodes.toArray(new SLExpressionNode[flattenedNodes.size()]));
            if (endPos - startPos > 0) {
                blockNode.setSourceSection(startPos, endPos - startPos);
            } else {
                blockNode.setSourceSection(startPos, 0);
            }
            return blockNode;
        }

        @Override
        public SLExpressionNode visitFor_expression(SimpleLanguageParser.For_expressionContext ctx) {
            List<TruffleString> newLocals = enterBlock(ctx.init);

            for (TruffleString newLocal : newLocals) {
                frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, newLocal, null);
            }


            int startPos;
            int endPos;

            var startToken = ctx.getStart();
            var endToken = ctx.getStop();
            if (startToken == null || endToken == null) {
                startPos = endPos = 0;
            } else {
                startPos = startToken.getStartIndex();
                endPos = endToken.getStopIndex();
            }

            List<SLExpressionNode> bodyNodes = new ArrayList<>();
            // ---
            SLExpressionNode initNode = (ctx.init.expression() == null) ? new SLSkipExpression() : expressionVisitor.visitExpression(ctx.init.expression());
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);
            loopDepth++;
            SLExpressionNode bodyExprNode = expressionVisitor.visitBlock(ctx.body);
            SLExpressionNode lastExprNode = expressionVisitor.visitExpression(ctx.last);
            SLExpressionNode body = new SLSeqNode(bodyExprNode, lastExprNode);
            loopDepth--;

            conditionNode.addStatementTag();
            final int start = ctx.f.getStartIndex();
            final int end = ctx.od.getStopIndex();
            final SLWhileExpression whileNode = new SLWhileExpression(conditionNode, body);
            whileNode.setSourceSection(start, end - start);
            SLExpressionNode cycleNode = new SLSeqNode(initNode, whileNode);
            // ---

            bodyNodes.add(cycleNode);

            for (var definition : ctx.init.def().reversed()) {
                var variableDefinition = definition.varSingleLineDef();
                if (variableDefinition != null) {
                    for (var variable : variableDefinition.varSingleDef().reversed()) {
                        if (variable.or_term() != null) {
                            var varToken = variable.IDENTIFIER().getSymbol();
                            var valueNode = expressionVisitor.visitOr_term(variable.or_term());
                            var result = createAssignment(createString(varToken, false), valueNode, null);
                            bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                        }
                    }
                }
            }

            exitBlock();

            List<SLExpressionNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
            flattenBlocks(bodyNodes, flattenedNodes);
            int n = flattenedNodes.size();
            for (int i = 0; i < n; i++) {
                SLStatementNode statement = flattenedNodes.get(i);
                if (statement.hasSource() && !isHaltInCondition(statement)) {
                    statement.addStatementTag();
                }
            }
            SLBlockExpression blockNode = new SLBlockExpression(flattenedNodes.toArray(new SLExpressionNode[flattenedNodes.size()]));
            if (endPos - startPos > 0) {
                blockNode.setSourceSection(startPos, endPos - startPos);
            } else {
                blockNode.setSourceSection(startPos, 0);
            }
            return blockNode;
        }

        @Override
        public SLExpressionNode visitArray_expression(SimpleLanguageParser.Array_expressionContext ctx) {
            SLExpressionNode[] children;
            var expr_list = ctx.expr_list();
            if (expr_list == null) {
                children = new SLExpressionNode[0];
            } else {
                children = expr_list.expression().stream().map(e -> expressionVisitor.visitExpression(e)).toArray(SLExpressionNode[]::new);
            }
            var result = new SLArrayLiteralNode(children);
            final int start = ctx.getStart().getStartIndex();
            final int end = ctx.getStop().getStopIndex() + 1;
            result.setSourceSection(start, end - start);
            return result;
        }

        @Override
        public SLExpressionNode visitSexp_expression(SimpleLanguageParser.Sexp_expressionContext ctx) {
            SLExpressionNode[] children;
            var expr_list = ctx.expr_list();
            if (expr_list == null) {
                children = new SLExpressionNode[0];
            } else {
                children = expr_list.expression().stream().map(e -> expressionVisitor.visitExpression(e)).toArray(SLExpressionNode[]::new);
            }
            var result = new SLSexpNode(ctx.UIDENTIFIER().getText(), children);
            final int start = ctx.getStart().getStartIndex();
            final int end = ctx.getStop().getStopIndex() + 1;
            result.setSourceSection(start, end - start);
            return result;
        }

        @Override
        public SLExpressionNode visitIf_expression(SimpleLanguageParser.If_expressionContext ctx) {
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);
            SLExpressionNode thenPartNode = expressionVisitor.visitBlock(ctx.then);
            SLExpressionNode elsePartNode = ctx.alt == null ? null : expressionVisitor.visitBlock(ctx.alt);
            conditionNode.addStatementTag();
            final int end = ctx.f.getStopIndex();
            var elifSequence = ctx.elifSequence();
            if (elifSequence != null) {
                for (int i = elifSequence.size() - 1; i >= 0; --i) {
                    var elifBlock = elifSequence.get(i);
                    var cond = expressionVisitor.visitExpression(elifBlock.cond);
                    var elif = expressionVisitor.visitBlock(elifBlock.elif);
                    cond.addStatementTag();
                    var ifExpr = new SLIfExpression(cond, elif, elsePartNode);
                    int st = elifBlock.el.getStartIndex();
                    ifExpr.setSourceSection(st, end - st);
                    elsePartNode = ifExpr;
                }
            }
            final int start = ctx.i.getStartIndex();
            final SLIfExpression ifNode = new SLIfExpression(conditionNode, thenPartNode, elsePartNode);
            ifNode.setSourceSection(start, end - start);
            return ifNode;
        }

        @Override
        public SLExpressionNode visitCase_expression(SimpleLanguageParser.Case_expressionContext ctx) {
            SLExpressionNode expr = expressionVisitor.visitExpression(ctx.expression());
            List<SLPatternNode> patternNodes = new ArrayList<>();
            List<SLExpressionNode> branchNodes = new ArrayList<>();
            var patternVisitor = new PatternVisitor(expr);
            for (var branch : ctx.case_branches().case_branch()) {
                patternVisitor.visitCase_branch(branch);
                patternNodes.add(patternVisitor.pattern);
                branchNodes.add(patternVisitor.branch);
                patternVisitor.clear();
            }
            var result = new SLCaseExpression(branchNodes.toArray(SLExpressionNode[]::new), patternNodes.toArray(SLPatternNode[]::new), expr);
            final int start = ctx.getStart().getStartIndex();
            final int end = ctx.getStop().getStopIndex() + 1;
            result.setSourceSection(start, end - start);
            return result;
        }

        @Override
        public SLExpressionNode visitExpression(ExpressionContext ctx) {
            return createBinary(ctx.or_term(), ctx.OP_SEQ());
        }

        @Override
        public SLExpressionNode visitOr_term(SimpleLanguageParser.Or_termContext ctx) {
            return createBinary(ctx.logic_term(), ctx.OP_OR());
        }

        @Override
        public SLExpressionNode visitLogic_term(Logic_termContext ctx) {
            return createBinary(ctx.logic_factor(), ctx.OP_AND());
        }

        @Override
        public SLExpressionNode visitLogic_factor(Logic_factorContext ctx) {
            return createBinary(ctx.arithmetic(), ctx.OP_COMPARE());
        }

        @Override
        public SLExpressionNode visitArithmetic(ArithmeticContext ctx) {
            return createBinary(ctx.term(), ctx.OP_ADD());
        }

        @Override
        public SLExpressionNode visitTerm(TermContext ctx) {
            return createBinary(ctx.factor(), ctx.OP_MUL());
        }

        private SLExpressionNode createBinary(List<? extends ParserRuleContext> children, TerminalNode op) {
            if (op == null) {
                assert children.size() == 1;
                return visit(children.get(0));
            } else {
                assert children.size() == 2;
                return createBinary(op.getSymbol(), visit(children.get(0)), visit(children.get(1)));
            }
        }

        private SLExpressionNode createBinary(List<? extends ParserRuleContext> children, List<TerminalNode> ops) {
            assert children.size() == ops.size() + 1;

            SLExpressionNode result = visit(children.get(0));

            for (int i = 0; i < ops.size(); i++) {
                result = createBinary(ops.get(i).getSymbol(), result, visit(children.get(i + 1)));
            }

            return result;
        }

        private SLExpressionNode createBinary(Token opToken, SLExpressionNode leftNode, SLExpressionNode rightNode) {
            final SLExpressionNode leftUnboxed = SLUnboxNodeGen.create(leftNode);
            final SLExpressionNode rightUnboxed = SLUnboxNodeGen.create(rightNode);

            final SLExpressionNode result;
            switch (opToken.getText()) {
                case ";":
                    result = new SLSeqNode(leftUnboxed, rightUnboxed);
                    break;
                case "+":
                    result = SLAddNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "*":
                    result = SLMulNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "%":
                    result = SLModNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "/":
                    result = SLDivNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "-":
                    result = SLSubNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "<":
                    result = SLLessThanNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "<=":
                    result = SLLessOrEqualNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case ">":
                    result = SLLogicalNotNodeGen.create(SLLessOrEqualNodeGen.create(leftUnboxed, rightUnboxed));
                    break;
                case ">=":
                    result = SLLogicalNotNodeGen.create(SLLessThanNodeGen.create(leftUnboxed, rightUnboxed));
                    break;
                case "==":
                    result = SLEqualNodeGen.create(leftUnboxed, rightUnboxed);
                    break;
                case "!=":
                    result = SLLogicalNotNodeGen.create(SLEqualNodeGen.create(leftUnboxed, rightUnboxed));
                    break;
                case "&&":
                    result = new SLLogicalAndNode(leftUnboxed, rightUnboxed);
                    break;
                case "!!":
                    result = new SLLogicalOrNode(leftUnboxed, rightUnboxed);
                    break;
                default:
                    throw new RuntimeException("unexpected operation: " + opToken.getText());
            }

            int start = leftNode.getSourceCharIndex();
            int length = rightNode.getSourceEndIndex() - start;
            result.setSourceSection(start, length);
            result.addExpressionTag();

            return result;
        }

        @Override
        public SLExpressionNode visitNameAccess(NameAccessContext ctx) {

            if (ctx.member_expression().isEmpty()) {
                return createRead(createString(ctx.IDENTIFIER().getSymbol(), false));
            }

            MemberExpressionVisitor visitor = new MemberExpressionVisitor(null, null,
                            createString(ctx.IDENTIFIER().getSymbol(), false));

            for (Member_expressionContext child : ctx.member_expression()) {
                visitor.visit(child);
            }

            return visitor.receiver;
        }

        @Override
        public SLExpressionNode visitStringLiteral(StringLiteralContext ctx) {
            return createString(ctx.STRING_LITERAL().getSymbol(), true);
        }

        @Override
        public SLExpressionNode visitNumericLiteral(NumericLiteralContext ctx) {
            Token literalToken = ctx.NUMERIC_LITERAL().getSymbol();
            SLExpressionNode result;
            try {
                /* Try if the literal is small enough to fit into a long value. */
                result = new SLLongLiteralNode(Long.parseLong(literalToken.getText()));
            } catch (NumberFormatException ex) {
                /* Overflow of long value, so fall back to BigInteger. */
                result = new SLBigIntegerLiteralNode(new BigInteger(literalToken.getText()));
            }
            srcFromToken(result, literalToken);
            result.addExpressionTag();
            return result;
        }

        @Override
        public SLExpressionNode visitParenExpression(ParenExpressionContext ctx) {
            SLExpressionNode expressionNode = visitBlock(ctx.block());

            int start = ctx.start.getStartIndex();
            int length = ctx.stop.getStopIndex() - start + 1;

            final SLParenExpressionNode result = new SLParenExpressionNode(expressionNode);
            result.setSourceSection(start, length);
            return result;
        }

        private class NonLocalVisitor extends SimpleLanguageBaseVisitor<SLPatternNode> {

        }

        private class PatternVisitor extends SimpleLanguageBaseVisitor<SLPatternNode> {
            SLExpressionNode branch = null;
            SLPatternNode pattern = null;
            List<Token> tokens = new ArrayList<>();
            Set<Token> ts = new HashSet<>();
            List<SLExpressionNode> nodes = new ArrayList<>();
            SLExpressionNode baseExpression;

            public PatternVisitor(SLExpressionNode baseExpression) {
                this.baseExpression = baseExpression;
            }

            @Override
            public SLPatternNode visitSexprPattern(SimpleLanguageParser.SexprPatternContext ctx) {
                var parent = baseExpression;
                List<SLPatternNode> subNodes = new ArrayList<>();
                long i = 0;
                for (var subCtx : ctx.pattern_list().pattern()) {
                    baseExpression = SLReadPropertyNodeGen.create(parent, new SLLongLiteralNode(i++));
                    baseExpression.addExpressionTag();
                    subNodes.add(visitPattern(subCtx));
                }
                baseExpression = parent;
                var tag = SLSexp.lTagHash(ctx.UIDENTIFIER().getSymbol().getText());
                return new SexprPattern(tag, subNodes.toArray(SLPatternNode[]::new));
            }

            @Override
            public SLPatternNode visitWildcardPattern(SimpleLanguageParser.WildcardPatternContext ctx) {
                return new WildCardPattern();
            }

            @Override
            public SLPatternNode visitArrayPattern(SimpleLanguageParser.ArrayPatternContext ctx) {
                var parent = baseExpression;
                List<SLPatternNode> subNodes = new ArrayList<>();
                long i = 0;
                for (var subCtx : ctx.pattern_list().pattern()) {
                    baseExpression = SLReadPropertyNodeGen.create(parent, new SLLongLiteralNode(i++));
                    baseExpression.addExpressionTag();
                    subNodes.add(visitPattern(subCtx));
                }
                baseExpression = parent;
                return new ArrayPattern(subNodes.toArray(SLPatternNode[]::new));
            }

            @Override
            public SLPatternNode visitListPattern(SimpleLanguageParser.ListPatternContext ctx) {
                return null;
            }

            @Override
            public SLPatternNode visitNamedPattern(SimpleLanguageParser.NamedPatternContext ctx) {
                var result = visitPattern(ctx.pattern());
                var tok = ctx.IDENTIFIER().getSymbol();
                if (ts.contains(tok)) {
                    throw new RuntimeException("Token redefinition");
                }
                tokens.add(tok);
                ts.add(tok);
                nodes.add(baseExpression);
                return result;
            }

            @Override
            public SLPatternNode visitDecimalPattern(SimpleLanguageParser.DecimalPatternContext ctx) {
                return new DecimalPattern(Long.parseLong(ctx.NUMERIC_LITERAL().getSymbol().getText()));
            }

            @Override
            public SLPatternNode visitStringPattern(SimpleLanguageParser.StringPatternContext ctx) {
                return new StringPattern(asTruffleString(ctx.STRING_LITERAL().getSymbol(), true));
            }

            @Override
            public SLPatternNode visitCharPattern(SimpleLanguageParser.CharPatternContext ctx) {
                return new DecimalPattern(ctx.CHAR_LITERAL().getSymbol().getText().charAt(1));
            }

            @Override
            public SLPatternNode visitTruePattern(SimpleLanguageParser.TruePatternContext ctx) {
                return new DecimalPattern(1);
            }

            @Override
            public SLPatternNode visitFalsePattern(SimpleLanguageParser.FalsePatternContext ctx) {
                return new DecimalPattern(0);
            }

            @Override
            public SLPatternNode visitBoxTagPattern(SimpleLanguageParser.BoxTagPatternContext ctx) {
                return new BoxTagPattern();
            }

            @Override
            public SLPatternNode visitValTagPattern(SimpleLanguageParser.ValTagPatternContext ctx) {
                return new ValTagPattern();
            }

            @Override
            public SLPatternNode visitStrTagPattern(SimpleLanguageParser.StrTagPatternContext ctx) {
                return new StrTagPattern();
            }

            @Override
            public SLPatternNode visitArrayTagPattern(SimpleLanguageParser.ArrayTagPatternContext ctx) {
                return new ArrayTagPattern();
            }

            @Override
            public SLPatternNode visitSexpTagPattern(SimpleLanguageParser.SexpTagPatternContext ctx) {
                return new SexpTagPattern();
            }

            @Override
            public SLPatternNode visitFunTagPattern(SimpleLanguageParser.FunTagPatternContext ctx) {
                return null;
            }

            @Override
            public SLPatternNode visitConsPattern(SimpleLanguageParser.ConsPatternContext ctx) {
                return null;
            }

            @Override
            public SLPatternNode visitCase_branch(SimpleLanguageParser.Case_branchContext ctx) {
                // ---
                pattern = visitPattern(ctx.pattern());
                // ---
                List<TruffleString> newLocals = enterBlock(ctx.block());

                for (TruffleString newLocal : newLocals) {
                    frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, newLocal, null);
                }
                declareVariables(tokens);
                for (var token : tokens) {
                    frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, asTruffleString(token, false), null);
                }

                int startPos;
                int endPos;

                var startToken = ctx.getStart();
                var endToken = ctx.getStop();
                if (startToken == null || endToken == null) {
                    startPos = endPos = 0;
                } else {
                    startPos = startToken.getStartIndex();
                    endPos = endToken.getStopIndex();
                }

                List<SLExpressionNode> bodyNodes = new ArrayList<>();
                // ---
                SLExpressionNode bodyExprNode = (ctx.block().expression() == null) ? new SLSkipExpression() : expressionVisitor.visitExpression(ctx.block().expression());
                // ---

                bodyNodes.add(bodyExprNode);

                for (var definition : ctx.block().def().reversed()) {
                    var variableDefinition = definition.varSingleLineDef();
                    if (variableDefinition != null) {
                        for (var variable : variableDefinition.varSingleDef().reversed()) {
                            if (variable.or_term() != null) {
                                var varToken = variable.IDENTIFIER().getSymbol();
                                var valueNode = expressionVisitor.visitOr_term(variable.or_term());
                                var result = createAssignment(createString(varToken, false), valueNode, null);
                                bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                            }
                        }
                    }
                }

                for (int i = 0; i < tokens.size(); ++i) {
                    var varToken = tokens.get(i);
                    var valueNode = nodes.get(i);
                    var result = createAssignment(createString(varToken, false), valueNode, null);
                    bodyNodes.set(0, new SLSeqNode(result, bodyNodes.get(0)));
                }

                exitBlock();

                List<SLExpressionNode> flattenedNodes = new ArrayList<>(bodyNodes.size());
                flattenBlocks(bodyNodes, flattenedNodes);
                int n = flattenedNodes.size();
                for (int i = 0; i < n; i++) {
                    SLStatementNode statement = flattenedNodes.get(i);
                    if (statement.hasSource() && !isHaltInCondition(statement)) {
                        statement.addStatementTag();
                    }
                }
                SLBlockExpression blockNode = new SLBlockExpression(flattenedNodes.toArray(new SLExpressionNode[flattenedNodes.size()]));
                if (endPos - startPos > 0) {
                    blockNode.setSourceSection(startPos, endPos - startPos);
                } else {
                    blockNode.setSourceSection(startPos, 0);
                }
                branch = blockNode;
                return null;
            }

            public void clear() {
                branch = null;
                pattern = null;
                tokens.clear();
                nodes.clear();
                ts.clear();
            }
        }
    }

    private class MemberExpressionVisitor extends SimpleLanguageBaseVisitor<SLExpressionNode> {
        SLExpressionNode receiver;
        private SLExpressionNode assignmentReceiver;
        private SLExpressionNode assignmentName;

        MemberExpressionVisitor(SLExpressionNode r, SLExpressionNode assignmentReceiver, SLExpressionNode assignmentName) {
            this.receiver = r;
            this.assignmentReceiver = assignmentReceiver;
            this.assignmentName = assignmentName;
        }

        @Override
        public SLExpressionNode visitMemberCall(MemberCallContext ctx) {
            List<SLExpressionNode> parameters = new ArrayList<>();
            if (receiver == null) {
                receiver = createCallRead(assignmentName);
            }

            for (ExpressionContext child : ctx.expression()) {
                parameters.add(expressionVisitor.visitExpression(child));
            }

            final SLExpressionNode result = new SLInvokeNode(receiver, parameters.toArray(new SLExpressionNode[parameters.size()]));

            final int startPos = receiver.getSourceCharIndex();
            final int endPos = ctx.stop.getStopIndex() + 1;
            result.setSourceSection(startPos, endPos - startPos);
            result.addExpressionTag();

            assignmentReceiver = receiver;
            receiver = result;
            assignmentName = null;
            return result;
        }

        @Override
        public SLExpressionNode visitMemberAssign(MemberAssignContext ctx) {
            final SLExpressionNode result;
            if (assignmentName == null) {
                semErr(ctx.or_term().start, "invalid assignment target");
                result = null;
            } else if (assignmentReceiver == null) {
                SLExpressionNode valueNode = expressionVisitor.visitOr_term(ctx.or_term());
                result = createAssignment((SLStringLiteralNode) assignmentName, valueNode, null);
            } else {
                // create write property
                SLExpressionNode valueNode = expressionVisitor.visitOr_term(ctx.or_term());

                result = SLWritePropertyNodeGen.create(assignmentReceiver, assignmentName, valueNode);

                final int start = assignmentReceiver.getSourceCharIndex();
                final int length = valueNode.getSourceEndIndex() - start;
                result.setSourceSection(start, length);
                result.addExpressionTag();
            }

            assignmentReceiver = receiver;
            receiver = result;
            assignmentName = null;

            return result;
        }

        @Override
        public SLExpressionNode visitMemberIndex(MemberIndexContext ctx) {
            if (receiver == null) {
                receiver = createRead(assignmentName);
            }

            SLExpressionNode nameNode = expressionVisitor.visitExpression(ctx.expression());
            assignmentName = nameNode;

            final SLExpressionNode result = SLReadPropertyNodeGen.create(receiver, nameNode);

            final int startPos = receiver.getSourceCharIndex();
            final int endPos = nameNode.getSourceEndIndex();
            result.setSourceSection(startPos, endPos - startPos);
            result.addExpressionTag();

            assignmentReceiver = receiver;
            receiver = result;

            return result;
        }

    }

    private SLExpressionNode createRead(SLExpressionNode nameTerm) {
        final TruffleString name = ((SLStringLiteralNode) nameTerm).executeGeneric(null);
        final SLExpressionNode result;
        final int frameSlot = getLocalIndex(name);
        if (frameSlot != -1) {
            result = SLReadLocalVariableNodeGen.create(frameSlot);
        } else {
            result = new SLReadGlobalVariableNode(globalToId.get(name));
        }
        result.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
        result.addExpressionTag();
        return result;
    }

    private SLExpressionNode createCallRead(SLExpressionNode nameTerm) {
        final TruffleString name = ((SLStringLiteralNode) nameTerm).executeGeneric(null);
        final SLExpressionNode result;
        result = SLFunctionLiteralNodeGen.create(new SLStringLiteralNode(name));
        result.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
        result.addExpressionTag();
        return result;
    }

    private SLExpressionNode createAssignment(SLStringLiteralNode assignmentName, SLExpressionNode valueNode, Integer index) {

        TruffleString name = assignmentName.executeGeneric(null);

        int frameSlot = getLocalIndex(name);
        SLExpressionNode result;
        if (frameSlot == -1) {
            result = new SLWriteGlobalVariableNode(globalToId.get(name), valueNode);
        } else {
            assert frameSlot != -1;
            boolean newVariable = initializeLocal(name);
            result = SLWriteLocalVariableNodeGen.create(valueNode, frameSlot, assignmentName, newVariable);
        }

        assert index != null || valueNode.hasSource();

        if (valueNode.hasSource()) {
            final int start = assignmentName.getSourceCharIndex();
            final int length = valueNode.getSourceEndIndex() - start;
            result.setSourceSection(start, Math.max(length, 0));
        }

        if (index == null) {
            result.addExpressionTag();
        }

        return result;
    }

    private static boolean isHaltInCondition(SLStatementNode statement) {
        return (statement instanceof SLIfExpression) || (statement instanceof SLWhileExpression);
    }

    private static void srcFromToken(SLStatementNode node, Token token) {
        node.setSourceSection(token.getStartIndex(), token.getText().length());
    }

}
