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

import com.oracle.truffle.sl.nodes.*;
import com.oracle.truffle.sl.nodes.expression.*;
import com.oracle.truffle.sl.nodes.local.*;
import com.oracle.truffle.sl.nodes.patterns.*;
import com.oracle.truffle.sl.runtime.SLContext;
import com.oracle.truffle.sl.runtime.SLSexp;
import com.oracle.truffle.sl.runtime.SLStrings;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
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

    private class NonLocal {
        String fMNameWhereFound;
        int vId;

        public NonLocal(String fMNameWhereFound, Integer vId) {
            this.fMNameWhereFound = fMNameWhereFound;
            this.vId = vId;
        }
    }
    private final Map<String, ArrayList<NonLocal>> mFuncToNonLocals = new HashMap<>();
    private final Map<String, Map<String, Map<Integer, Integer>>> mFuncToFoundMFuncToVarIdToInd = new HashMap<>();
    private final Map<String, Map<String, Integer>> mFuncToVarNameToInd = new HashMap<>();

    protected SLNodeParser(SLLanguage language, Source source) {
        super(language, source);
    }

    @Override
    public Void visitBlock(SimpleLanguageParser.BlockContext ctx) { // add main
        if (mainBlockVisited) return visitChildren(ctx);
        mainBlockVisited = true;
        new NonLocalVisitor().visitMainBlock(ctx);
        // ----
//        for (var name: funcToNonLocals.keySet()) {
//            System.out.println("K: " + name);
//            var nls = funcToNonLocals.get(name);
//            for (var nl : nls) {
//                System.out.println("found-" + nl.fNameWhereFound);
//                System.out.println("id-" + nl.vId);
//            }
//        }
//        System.out.println("------------------------");
//        for (var name: funcToVarNameToInd.keySet()) {
//            System.out.println("K: " + name);
//            for (var vname : funcToVarNameToInd.get(name).keySet()) {
//                System.out.println("V: " + vname);
//                System.out.println("I: " + funcToVarNameToInd.get(name).get(vname));
//            }
//        }
        // ----

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

        enterMainFunction(builtins);

        SLBlockExpression bodyNode = (SLBlockExpression) expressionVisitor.visitMainBlock(ctx);

        exitFunction();

        methodNodes.addAll(bodyNode.getExpression());
        final int bodyEndPos = bodyNode.getSourceEndIndex();
        final SourceSection functionSrc = source.createSection(functionStartPos, bodyEndPos - functionStartPos);
        final SLExpressionNode methodBlock = new SLBlockExpression(methodNodes.toArray(new SLExpressionNode[methodNodes.size()]));
        methodBlock.setSourceSection(functionStartPos, bodyEndPos - functionStartPos);

        methodBlock.setIsTail();
        final SLFunctionBodyNode functionBodyNode = new SLFunctionBodyNode(methodBlock);
        functionBodyNode.setSourceSection(functionSrc.getCharIndex(), functionSrc.getCharLength());

        final SLRootNode rootNode = new SLAstRootNode(language, frameDescriptorBuilder.build(), functionBodyNode, functionSrc, functionName);
        functions.put(functionName, rootNode.getCallTarget());

        frameDescriptorBuilder = null;

        return visitChildren(ctx);
    }

    @Override
    public Void visitLambda_expression(SimpleLanguageParser.Lambda_expressionContext ctx) {
        int functionStartPos = ctx.b.getStartIndex();
        TruffleString functionName = TruffleString.fromConstant("@lambda" + functionStartPos, TruffleString.Encoding.UTF_8);
        currentFunction = functionName.toString();
        currentMFunction = currentFunction;

        frameDescriptorBuilder = FrameDescriptor.newBuilder();
        List<SLExpressionNode> methodNodes = new ArrayList<>();

        int i = 0;
        int parameterCount;
        if (mFuncToNonLocals.containsKey(functionName.toString()) && !mFuncToNonLocals.get(functionName.toString()).isEmpty()) {
            parameterCount = enterLambdaWithClosure(ctx, functionName).size();
            TruffleString paramName = TruffleString.fromConstant("@closure", TruffleString.Encoding.UTF_8);
            int localIndex = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, paramName, null);
            assert localIndex == i;

            final SLReadArgumentNode readArg = new SLReadArgumentNode(i);
            readArg.setSourceSection(0, 0);
            SLExpressionNode assignment = createAssignment(createString(paramName), readArg, i);
            methodNodes.add(assignment);
            i++;
        } else {
            parameterCount = enterLambda(ctx, functionName).size();
        }
        for (; i < parameterCount; i++) {
            Token paramToken = ctx.IDENTIFIER(i).getSymbol();

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

        methodBlock.setIsTail();
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
        currentFunction = functionName.toString();
        currentMFunction = mangleName(currentFunction, ctx.s.getStartIndex());

        int functionStartPos = nameToken.getStartIndex();
        frameDescriptorBuilder = FrameDescriptor.newBuilder();
        List<SLExpressionNode> methodNodes = new ArrayList<>();


        int i = 0;
        int parameterCount;
        if (mFuncToNonLocals.containsKey(currentMFunction) && !mFuncToNonLocals.get(currentMFunction).isEmpty()) {
            parameterCount = enterFunctionWithClosure(ctx, functionName).size();
            TruffleString paramName = TruffleString.fromConstant("@closure", TruffleString.Encoding.UTF_8);
            int localIndex = frameDescriptorBuilder.addSlot(FrameSlotKind.Illegal, paramName, null);
            assert localIndex == i;

            final SLReadArgumentNode readArg = new SLReadArgumentNode(i);
            readArg.setSourceSection(0, 0);
            SLExpressionNode assignment = createAssignment(createString(paramName), readArg, i);
            methodNodes.add(assignment);
            i++;
        } else {
            parameterCount = enterFunction(ctx, functionName).size();
        }
        for (; i < parameterCount; i++) {
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

        methodBlock.setIsTail();
        final SLFunctionBodyNode functionBodyNode = new SLFunctionBodyNode(methodBlock);
        functionBodyNode.setSourceSection(functionSrc.getCharIndex(), functionSrc.getCharLength());

        var functionMName = TruffleString.fromConstant(currentMFunction, TruffleString.Encoding.UTF_8);
        final SLRootNode rootNode = new SLAstRootNode(language, frameDescriptorBuilder.build(), functionBodyNode, functionSrc, functionMName);
        functions.put(functionMName, rootNode.getCallTarget());

        frameDescriptorBuilder = null;

        return visitChildren(ctx);
    }

    private SLStringLiteralNode createString(Token name, boolean removeQuotes) {
        SLStringLiteralNode node = new SLStringLiteralNode(asTruffleString(name, removeQuotes));
        node.setSourceSection(name.getStartIndex(), name.getStopIndex() - name.getStartIndex() + 1);
        return node;
    }

    private SLStringLiteralNode createString(TruffleString name) {
        SLStringLiteralNode node = new SLStringLiteralNode(name);
        node.setSourceSection(0, 0);
        return node;
    }

    private class SLExpressionVisitor extends SimpleLanguageBaseVisitor<SLExpressionNode> {
        @Override
        public SLExpressionNode visitLambda_expression(SimpleLanguageParser.Lambda_expressionContext ctx) {
            return createRead(createString(TruffleString.fromConstant("@lambda" + ctx.b.getStartIndex(), TruffleString.Encoding.UTF_8)));
        }

        @Override
        public SLExpressionNode visitBlock(BlockContext ctx) {
            List<TruffleString> newLocals = enterBlock(ctx);
            addFunctionsInScope(ctx);

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
            exitScope();

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
            addFunctionsInScope(ctx);
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

            exitScope();
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
            addFunctionsInScope(ctx.body);

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
            exitScope();

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
            addFunctionsInScope(ctx.init);

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
            exitScope();

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
            if (start < 0 || length < 0) {
                result.setSourceSection(0, 0);
            } else {
                result.setSourceSection(start, length);
            }
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
                addFunctionsInScope(ctx.block());

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
                exitScope();

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

    private String currentFunction = "@main";
    private String currentMFunction = "@main";

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
                final TruffleString name = ((SLStringLiteralNode) assignmentName).executeGeneric(null);
                receiver = createCallRead(assignmentName);
                var mName = accessibleWith(name.toString());
                if (mFuncToNonLocals.containsKey(mName) && !mFuncToNonLocals.get(mName).isEmpty()) {
                    List<SLExpressionNode> accessors = new ArrayList<>();
//                    System.out.println(name + "<<<" + mName);///
                    for (var nl : mFuncToNonLocals.get(mName)) {
                        if (nl.fMNameWhereFound.equals(currentMFunction)) {
                            var id = nl.vId;
                            if (mFuncToNonLocals.containsKey(currentMFunction) && !mFuncToNonLocals.get(currentMFunction).isEmpty()) {
                                id += 1;
                            }
                            accessors.add(SLReadLocalVariableNodeGen.create(id));
                        } else {
//                            System.out.println(currentFunction); ////
//                            System.out.println(nl.fNameWhereFound);
//                            System.out.println(nl.vId);
//                            System.out.println(currentFunction); ////
//                            System.out.println(nl.fMNameWhereFound);
                            mFuncToFoundMFuncToVarIdToInd.get(currentMFunction);
                            mFuncToFoundMFuncToVarIdToInd.get(currentMFunction).get(nl.fMNameWhereFound);
                            int id = mFuncToFoundMFuncToVarIdToInd.get(currentMFunction).get(nl.fMNameWhereFound).get(nl.vId);
                            accessors.add(SLReadPropertyNodeGen.create(SLReadLocalVariableNodeGen.create(0), new SLLongLiteralNode(id)));
                        }
                    }
                    var closureNode = new SLClosureLiteralNode(accessors.toArray(SLExpressionNode[]::new));
                    parameters.add(closureNode);
                }
            }
            // process Closure

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

    public boolean isFunction(String name) {
        return accessibleWith(name) != null; // TODO
    }

    List<TruffleString> builtins = Arrays.asList(
            TruffleString.fromConstant("write", TruffleString.Encoding.UTF_8),
            TruffleString.fromConstant("stacktrace", TruffleString.Encoding.UTF_8),
            TruffleString.fromConstant("helloEqualsWorld", TruffleString.Encoding.UTF_8)
    );

    private class NonLocalVisitor extends SimpleLanguageBaseVisitor<Void> {
        private List<LocalScope> functionScopes = new ArrayList<>();
        private List<String> functionMNames = new ArrayList<>();
        private String currentFunction = "@main";
        private String calledMFName = null;
        private Map<String, ArrayList<String>> mFuncToWait2mFuncToAdd = new HashMap<>();
        private Map<String, Integer> mFunctionLevel = new HashMap<>();

        private class LambdaNLVisitor extends SimpleLanguageBaseVisitor<Void> {
            @Override
            public Void visitLambda_expression(SimpleLanguageParser.Lambda_expressionContext ctx) {
                currentFunction = "@lambda" + ctx.b.getStartIndex();
                // System.out.println(currentFunction);//
                mFunctionLevel.put(currentFunction, functionScopes.size());
                enterLambda(ctx, TruffleString.fromConstant(currentFunction, TruffleString.Encoding.UTF_8));
                NonLocalVisitor.this.visitBlock(ctx.body);
                // System.out.println("exit visitFunction " + currentFunction); //
                return null;
            }
            @Override
            public Void visitBlock(SimpleLanguageParser.BlockContext ctx) {
                return null;
            }
        }

        private boolean definedNonLocal(String func, String varName) {
            if (mFuncToVarNameToInd.containsKey(func)) {
                return mFuncToVarNameToInd.get(func).containsKey(varName);
            }
            return false;
        }

        private boolean containsTheSame(String func, String foundFunc, Integer varId) {
            return mFuncToFoundMFuncToVarIdToInd.get(func).containsKey(foundFunc)
                    && mFuncToFoundMFuncToVarIdToInd.get(func).get(foundFunc).containsKey(varId);
        }

        @Override
        public Void visitLambda_expression(SimpleLanguageParser.Lambda_expressionContext ctx) {
            return null;
        }

        private void addNonLocal(String func, Integer varId, String funcWhereFound, String varName) {
            if (!mFuncToNonLocals.containsKey(func)) {
                mFuncToNonLocals.put(func, new ArrayList<>());
                mFuncToFoundMFuncToVarIdToInd.put(func, new HashMap<>());
                mFuncToFoundMFuncToVarIdToInd.get(func).put(func, new HashMap<>());
                mFuncToVarNameToInd.put(func, new HashMap<>());
            }
            if (!mFuncToFoundMFuncToVarIdToInd.get(func).containsKey(funcWhereFound)) {
                mFuncToFoundMFuncToVarIdToInd.get(func).put(funcWhereFound, new HashMap<>());
            }
            int ind = mFuncToNonLocals.get(func).size();
            mFuncToNonLocals.get(func).add(new NonLocal(funcWhereFound, varId));
            mFuncToFoundMFuncToVarIdToInd.get(func).get(funcWhereFound).put(varId, ind);
            mFuncToVarNameToInd.get(func).put(varName, ind);
        }

        private void addNonLocal(String func, Integer varId, String funcWhereFound) {
            if (!mFuncToNonLocals.containsKey(func)) {
                mFuncToNonLocals.put(func, new ArrayList<>());
                mFuncToFoundMFuncToVarIdToInd.put(func, new HashMap<>());
                mFuncToFoundMFuncToVarIdToInd.get(func).put(func, new HashMap<>());
            }
            int ind = mFuncToNonLocals.get(func).size();
            mFuncToNonLocals.get(func).add(new NonLocal(funcWhereFound, varId));
            mFuncToFoundMFuncToVarIdToInd.get(func).get(funcWhereFound).put(varId, ind);
        }

        private void visitFunctionsInsideBlock(SimpleLanguageParser.BlockContext ctx) {
            for (var def : ctx.def()) {
                if (def.function() != null) {
                    visitFunction(def.function());
                }
            }
            if (ctx.expression() != null) {
                new LambdaNLVisitor().visitChildren(ctx.expression());
            }
        }

        public void visitMainBlock(SimpleLanguageParser.BlockContext ctx) {
            enterMainFunction(builtins);
            var fName = currentFunction;
            var fMName = currentMFunction;
            var scope = curScope;
            functionScopes.add(scope);
            functionMNames.add(fMName);
            visitFunctionsInsideBlock(ctx);
            functionScopes.removeLast();
            functionMNames.removeLast();
            currentFunction = fName;
            currentMFunction = fMName;
            if (ctx.expression() != null) {
                visitChildren(ctx.expression());
            }

            exitFunction();
            var changed = true;
            while (changed) {
                changed = false;
                for (var fToWait : mFuncToWait2mFuncToAdd.keySet()) {
                    for (var fToAdd : mFuncToWait2mFuncToAdd.get(fToWait)) {
                        //System.out.println(fToWait); ////
                        //System.out.println(fToAdd); ////
                        for (var nl : mFuncToNonLocals.get(fToWait)) {
                            var funcWhereWasFound = nl.fMNameWhereFound;
                            var varId = nl.vId;
                            if (!containsTheSame(fToAdd, funcWhereWasFound, varId)) {
                                // addNonLocal(fToAdd, varId, funcWhereWasFound); TODO
                                changed = true;
                            }
                        }
                    }
                }
            }
        }

        private String currentMFunction = "@main";

        @Override
        public Void visitFunction(SimpleLanguageParser.FunctionContext ctx) {
            currentFunction = ctx.IDENTIFIER(0).getText();
            currentMFunction = mangleName(currentFunction, ctx.s.getStartIndex());
            enterFunction(ctx, TruffleString.fromConstant(currentFunction, TruffleString.Encoding.UTF_8));
            // System.out.println(currentFunction);//
            mFunctionLevel.put(currentMFunction, functionScopes.size());

            visitBlock(ctx.body);

            // System.out.println("exit visitFunction " + currentFunction); //
            return null;
        }

        @Override
        public Void visitBlock(SimpleLanguageParser.BlockContext ctx) {
            var fName = currentFunction;
            var fMName = currentMFunction;
            enterBlock(ctx);
            addFunctionsInScope(ctx);
            var scope = curScope;
            exitBlock();
            exitFunction();
            functionScopes.add(scope);
            functionMNames.add(fMName);
            visitFunctionsInsideBlock(ctx);
            curScope = functionScopes.removeLast();
            functionMNames.removeLast();
            currentFunction = fName;
            currentMFunction = fMName;
            if (ctx.expression() != null) {
                visitChildren(ctx.expression());
            }
            exitBlock();
            exitScope();
            return null;
        }

        @Override
        public Void visitFor_expression(SimpleLanguageParser.For_expressionContext ctx) {
            var fName = currentFunction;
            var fMName = currentMFunction;
            enterBlock(ctx.init);
            addFunctionsInScope(ctx.init);
            var scope = curScope;
            exitBlock();
            exitFunction();
            functionScopes.add(scope);
            functionMNames.add(fMName);
            visitFunctionsInsideBlock(ctx.init);
            curScope = functionScopes.removeLast();
            functionMNames.removeLast();
            currentFunction = fName;
            currentMFunction = fMName;
            if (ctx.init.expression() != null) {
                visitExpression(ctx.init.expression());
            }
            visitExpression(ctx.condition);
            visitBlock(ctx.body);
            visitExpression(ctx.last);
            exitBlock();
            exitScope();
            return null;
        }

        @Override
        public Void visitDo_while_expression(SimpleLanguageParser.Do_while_expressionContext ctx) {
            var fName = currentFunction;
            var fMName = currentMFunction;
            enterBlock(ctx.body);
            addFunctionsInScope(ctx.body);
            var scope = curScope;
            exitBlock();
            exitFunction();
            functionScopes.add(scope);
            functionMNames.add(fMName);
            visitFunctionsInsideBlock(ctx.body);
            curScope = functionScopes.removeLast();
            functionMNames.removeLast();
            currentFunction = fName;
            currentMFunction = fMName;
            if (ctx.body.expression() != null) {
                visitExpression(ctx.body.expression());
            }
            visitExpression(ctx.condition);
            exitBlock();
            exitScope();
            return null;
        }

        @Override
        public Void visitCase_expression(SimpleLanguageParser.Case_expressionContext ctx) {
            visitExpression(ctx.expression());
            for (var branch : ctx.case_branches().case_branch()) {
                visitCase_branch(branch);
            }
            return null;
        }

        private ArrayList<Token> toks = new ArrayList<>();

        @Override
        public Void visitCase_branch(SimpleLanguageParser.Case_branchContext ctx) {
            toks.clear();
            visitPattern(ctx.pattern());

            var fName = currentFunction;
            var fMName = currentMFunction;
            enterBlock(ctx.block());
            addFunctionsInScope(ctx.block());
            declareVariables(toks);
            var scope = curScope;
            exitBlock();
            exitFunction();
            functionScopes.add(scope);
            functionMNames.add(fMName);
            visitFunctionsInsideBlock(ctx.block());
            curScope = functionScopes.removeLast();
            functionMNames.removeLast();
            currentFunction = fName;
            currentMFunction = fMName;
            if (ctx.block().expression() != null) {
                visitChildren(ctx.block().expression());
            }
            exitBlock();
            exitScope();
            return null;
        }

        @Override
        public Void visitNamedPattern(SimpleLanguageParser.NamedPatternContext ctx) {
            toks.add(ctx.IDENTIFIER().getSymbol());
            visitChildren(ctx);
            return null;
        }

        @Override
        public Void visitNameAccess(SimpleLanguageParser.NameAccessContext ctx) {
            var tok = ctx.IDENTIFIER().getSymbol();
            var tokName = tok.getText();
            var tokTrStr = asTruffleString(tok, false);
            calledMFName = accessibleWith(tokName);
            if (!isFunction(tokName)) {
                if (getLocalIndex(tok) == -1 && !definedNonLocal(currentMFunction, tokName)) {
                    for (int i = functionScopes.size() - 1; i >= 0; --i) {
                        var scope = functionScopes.get(i);
                        if (scope.getLocalIndex(tokTrStr) != -1) {
//                            System.out.println(tok); ////
//                            for (var fnm : functionNames) {
//                                System.out.println(fnm); ////
//                            } ////
                            addNonLocal(currentMFunction, scope.getLocalIndex(tokTrStr), functionMNames.get(i), tokName);
                            break;
                        }
                    }
                }
            }
            visitChildren(ctx);
            return null;
        }

        @Override
        public Void visitMemberCall(SimpleLanguageParser.MemberCallContext ctx) {
            if (calledMFName == null) {
                return null;
            }
            if (!Objects.equals(mFunctionLevel.get(calledMFName), mFunctionLevel.get(currentMFunction))) {
                // System.out.println("MCall: " + calledFName); //
                var nonLocals = mFuncToNonLocals.get(calledMFName);
                if (nonLocals == null) {
                    return null; // builtin TODO
                }
                for (var nl : mFuncToNonLocals.get(calledMFName)) {
                    var funcWhereWasFound = nl.fMNameWhereFound;
                    var varId = nl.vId;
                    if (!containsTheSame(currentMFunction, funcWhereWasFound, varId)) {
                        addNonLocal(currentMFunction, varId, funcWhereWasFound);
                    }
                }
            } else {
                if (!calledMFName.startsWith("L")) {
                    return null; // builtin
                }
                if (!mFuncToWait2mFuncToAdd.containsKey(calledMFName)) {
                    mFuncToWait2mFuncToAdd.put(calledMFName, new ArrayList<>());
                }
                mFuncToWait2mFuncToAdd.get(calledMFName).add(currentMFunction);
            }
            return null;
        }
    }

    private SLExpressionNode createRead(SLExpressionNode nameTerm) {
        final TruffleString name = ((SLStringLiteralNode) nameTerm).executeGeneric(null);
        final SLExpressionNode result;
        if (isFunction(name.toString())) { // process := fname
            SLExpressionNode closureNode = null;
            var mName = accessibleWith(name.toString());
            if (mFuncToNonLocals.containsKey(mName) && !mFuncToNonLocals.get(mName).isEmpty()) {
                List<SLExpressionNode> accessors = new ArrayList<>();
                for (var nl : mFuncToNonLocals.get(mName)) {
                    if (nl.fMNameWhereFound.equals(currentFunction)) {
                        var id = nl.vId;
                        if (mFuncToNonLocals.containsKey(currentMFunction) && !mFuncToNonLocals.get(currentMFunction).isEmpty()) {
                            id += 1;
                        }
                        accessors.add(SLReadLocalVariableNodeGen.create(id));
                    } else {
//                            System.out.println(currentFunction); ////
//                            System.out.println(nl.fNameWhereFound);
//                            System.out.println(nl.vId);
//                            funcToFoundFuncToVarIdToInd.get(currentFunction);
//                            funcToFoundFuncToVarIdToInd.get(currentFunction).get(nl.fNameWhereFound); ////
                        int id = mFuncToFoundMFuncToVarIdToInd.get(currentMFunction).get(nl.fMNameWhereFound).get(nl.vId);
                        accessors.add(SLReadPropertyNodeGen.create(SLReadLocalVariableNodeGen.create(0), new SLLongLiteralNode(id)));
                    }
                }
                closureNode = new SLClosureLiteralNode(accessors.toArray(SLExpressionNode[]::new));
            }
            final SLExpressionNode func;
            func = SLFunctionLiteralNodeGen.create(new SLStringLiteralNode(TruffleString.fromConstant(mName, TruffleString.Encoding.UTF_8)));
            func.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
            func.addExpressionTag();
            return new SLFunctionWithClosureExpression(closureNode, func);
        }
        final int frameSlot = getLocalIndex(name);
        if (frameSlot != -1) {
            result = SLReadLocalVariableNodeGen.create(frameSlot);
        } else {
            if (mFuncToVarNameToInd.containsKey(currentMFunction) && mFuncToVarNameToInd.get(currentMFunction).containsKey(name.toString())) {
                var id = mFuncToVarNameToInd.get(currentMFunction).get(name.toString());
                result = SLReadPropertyNodeGen.create(SLReadLocalVariableNodeGen.create(0), new SLLongLiteralNode(id));
            } else {
                //System.out.println(name); ////
                result = new SLReadGlobalVariableNode(globalToId.get(name));
            }
        }
        result.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
        result.addExpressionTag();
        return result;
    }

    private SLExpressionNode createCallRead(SLExpressionNode nameTerm) { // TODO: eliminate ?
        final TruffleString name = ((SLStringLiteralNode) nameTerm).executeGeneric(null);
        // System.out.println(name.toString());////
        if (isFunction(name.toString())) { // name of the function
            final SLExpressionNode result;
            result = SLFunctionLiteralNodeGen.create(new SLStringLiteralNode(TruffleString.fromConstant(accessibleWith(name.toString()), TruffleString.Encoding.UTF_8)));
            result.setSourceSection(nameTerm.getSourceCharIndex(), nameTerm.getSourceLength());
            result.addExpressionTag();
            return result;
        } else {
            return createRead(nameTerm);
        }
    }

    private SLExpressionNode createAssignment(SLStringLiteralNode assignmentName, SLExpressionNode valueNode, Integer index) {
        TruffleString name = assignmentName.executeGeneric(null);

//            var sc = curScope; ////
//            int l = 0;
//            while (sc != null) {
//                l += 1;
//                sc = sc.parent;
//            }
//            System.out.println(l);////
//            System.out.println(currentFunction); ////
//            System.out.println(name.toString());////

        int frameSlot = getLocalIndex(name);
        SLExpressionNode result;
        if (frameSlot == -1) {
//            System.out.println(currentFunction); ////
//            System.out.println(name.toString());////
            if (mFuncToVarNameToInd.containsKey(currentMFunction) && mFuncToVarNameToInd.get(currentMFunction).containsKey(name.toString())) {
                var id = mFuncToVarNameToInd.get(currentMFunction).get(name.toString());
                result = SLReadPropertyNodeGen.create(SLReadLocalVariableNodeGen.create(0), new SLLongLiteralNode(id));
            } else {
                result = new SLWriteGlobalVariableNode(globalToId.get(name), valueNode);
            }
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
