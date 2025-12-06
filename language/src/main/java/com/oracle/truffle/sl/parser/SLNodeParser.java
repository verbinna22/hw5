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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oracle.truffle.sl.nodes.expression.*;
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
import com.oracle.truffle.sl.nodes.SLAstRootNode;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLRootNode;
import com.oracle.truffle.sl.nodes.SLStatementNode;
import com.oracle.truffle.sl.nodes.controlflow.SLBreakNode;
import com.oracle.truffle.sl.nodes.controlflow.SLContinueNode;
import com.oracle.truffle.sl.nodes.controlflow.SLDebuggerNode;
import com.oracle.truffle.sl.nodes.controlflow.SLFunctionBodyNode;
import com.oracle.truffle.sl.nodes.controlflow.SLReturnNode;
import com.oracle.truffle.sl.nodes.local.SLReadArgumentNode;
import com.oracle.truffle.sl.nodes.local.SLReadLocalVariableNodeGen;
import com.oracle.truffle.sl.nodes.local.SLWriteLocalVariableNodeGen;
import com.oracle.truffle.sl.nodes.util.SLUnboxNodeGen;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ArithmeticContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.BlockContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Break_statementContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Continue_statementContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Debugger_statementContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ExpressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Expression_statementContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.FunctionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Logic_factorContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Logic_termContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberAssignContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberCallContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberFieldContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.MemberIndexContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Member_expressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.NameAccessContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.NumericLiteralContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.ParenExpressionContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.Return_statementContext;
import com.oracle.truffle.sl.parser.SimpleLanguageParser.StatementContext;
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

    private SLStatementVisitor statementVisitor = new SLStatementVisitor();
    private SLExpressionVisitor expressionVisitor = new SLExpressionVisitor();
    private int loopDepth = 0;
    private final Map<TruffleString, RootCallTarget> functions = new HashMap<>();

    protected SLNodeParser(SLLanguage language, Source source) {
        super(language, source);
    }

    @Override
    public Void visitBlock(SimpleLanguageParser.BlockContext ctx) { // add main
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

        SLBlockExpression bodyNode = (SLBlockExpression) statementVisitor.visitBlock(ctx);

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

        for (var definition : ctx.def()) {
            var f = definition.function();
            if (f != null) {
                System.out.println(f.IDENTIFIER(0).getText());
                SLNodeParser.this.visitFunction(f);
            }
        }
        return null;
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

        SLBlockExpression bodyNode = (SLBlockExpression) statementVisitor.visitBlock(ctx.body);

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

        return null;
    }

    private SLStringLiteralNode createString(Token name, boolean removeQuotes) {
        SLStringLiteralNode node = new SLStringLiteralNode(asTruffleString(name, removeQuotes));
        node.setSourceSection(name.getStartIndex(), name.getStopIndex() - name.getStartIndex() + 1);
        return node;
    }

    private class SLStatementVisitor extends SimpleLanguageBaseVisitor<SLStatementNode> {
        @Override
        public SLStatementNode visitBlock(BlockContext ctx) {

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

//            for (StatementContext child : ctx.expression()) {
//
//            }
            bodyNodes.add(expressionVisitor.visitExpression(ctx.expression()));

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
            if (startPos != 0 || endPos != 0) {
                blockNode.setSourceSection(startPos, endPos - startPos);
            } else {
                blockNode.setUnavailableSourceSection();
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
        public SLStatementNode visitDebugger_statement(Debugger_statementContext ctx) {
            final SLDebuggerNode debuggerNode = new SLDebuggerNode();
            srcFromToken(debuggerNode, ctx.d);
            return debuggerNode;
        }

        @Override
        public SLStatementNode visitBreak_statement(Break_statementContext ctx) {
            if (loopDepth == 0) {
                semErr(ctx.b, "break used outside of loop");
            }
            final SLBreakNode breakNode = new SLBreakNode();
            srcFromToken(breakNode, ctx.b);
            return breakNode;
        }

        @Override
        public SLStatementNode visitContinue_statement(Continue_statementContext ctx) {
            if (loopDepth == 0) {
                semErr(ctx.c, "continue used outside of loop");
            }
            final SLContinueNode continueNode = new SLContinueNode();
            srcFromToken(continueNode, ctx.c);
            return continueNode;
        }


        @Override
        public SLStatementNode visitReturn_statement(Return_statementContext ctx) {

            final SLExpressionNode valueNode;
            if (ctx.expression() != null) {
                valueNode = expressionVisitor.visitExpression(ctx.expression());
            } else {
                valueNode = null;
            }

            final int start = ctx.r.getStartIndex();
            final int length = valueNode == null ? ctx.r.getText().length() : valueNode.getSourceEndIndex() - start;
            final SLReturnNode returnNode = new SLReturnNode(valueNode);
            returnNode.setSourceSection(start, length);
            return returnNode;
        }

        @Override
        public SLStatementNode visitStatement(StatementContext ctx) {
            return visit(ctx.getChild(0));
        }

        @Override
        public SLStatementNode visitExpression_statement(Expression_statementContext ctx) {
            return expressionVisitor.visitExpression(ctx.expression());
        }

        @Override
        public SLStatementNode visitChildren(RuleNode arg0) {
            throw new UnsupportedOperationException("node: " + arg0.getClass().getSimpleName());
        }
    }

    private class SLExpressionVisitor extends SimpleLanguageBaseVisitor<SLExpressionNode> {
        @Override
        public SLExpressionNode visitWhile_expression(SimpleLanguageParser.While_expressionContext ctx) {
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);
            loopDepth++;
            SLStatementNode bodyNode = statementVisitor.visitBlock(ctx.body);
            loopDepth--;

            conditionNode.addStatementTag();
            final int start = ctx.w.getStartIndex();
            final int end = bodyNode.getSourceEndIndex();
            final SLWhileExpression whileNode = new SLWhileExpression(conditionNode, bodyNode);
            whileNode.setSourceSection(start, end - start);
            return whileNode;
        }

        @Override
        public SLExpressionNode visitIf_expression(SimpleLanguageParser.If_expressionContext ctx) {
            SLExpressionNode conditionNode = expressionVisitor.visitExpression(ctx.condition);
            SLStatementNode thenPartNode = expressionVisitor.visitBlock(ctx.then);
            SLStatementNode elsePartNode = ctx.alt == null ? null : expressionVisitor.visitBlock(ctx.alt);

            conditionNode.addStatementTag();
            final int start = ctx.i.getStartIndex();
            final int end = elsePartNode == null ? thenPartNode.getSourceEndIndex() : elsePartNode.getSourceEndIndex();
            final SLIfExpression ifNode = new SLIfExpression(conditionNode, thenPartNode, elsePartNode);
            ifNode.setSourceSection(start, end - start);
            return ifNode;
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

            SLExpressionNode expressionNode = visitExpression(ctx.expression());
            if (expressionNode == null) {
                return null;
            }

            int start = ctx.start.getStartIndex();
            int length = ctx.stop.getStopIndex() - start + 1;

            final SLParenExpressionNode result = new SLParenExpressionNode(expressionNode);
            result.setSourceSection(start, length);
            return result;
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
                receiver = createRead(assignmentName);
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
        public SLExpressionNode visitMemberField(MemberFieldContext ctx) {
            if (receiver == null) {
                receiver = createRead(assignmentName);
            }

            SLExpressionNode nameNode = createString(ctx.IDENTIFIER().getSymbol(), false);
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
            result = SLFunctionLiteralNodeGen.create(new SLStringLiteralNode(name));
        }
        result.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
        result.addExpressionTag();
        return result;
    }

    private SLExpressionNode createAssignment(SLStringLiteralNode assignmentName, SLExpressionNode valueNode, Integer index) {

        TruffleString name = assignmentName.executeGeneric(null);

        int frameSlot = getLocalIndex(name);
        assert frameSlot != -1;
        boolean newVariable = initializeLocal(name);
        SLExpressionNode result = SLWriteLocalVariableNodeGen.create(valueNode, frameSlot, assignmentName, newVariable);

        assert index != null || valueNode.hasSource();

        if (valueNode.hasSource()) {
            final int start = assignmentName.getSourceCharIndex();
            final int length = valueNode.getSourceEndIndex() - start;
            result.setSourceSection(start, length);
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
