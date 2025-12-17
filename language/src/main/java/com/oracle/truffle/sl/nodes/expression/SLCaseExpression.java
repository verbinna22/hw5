package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLNull;

@NodeInfo(shortName = "case", description = "The node implementing a match statement")
public final class SLCaseExpression extends SLExpressionNode {
    @Node.Children
    private final SLExpressionNode[] branchNodes;
    @Node.Children
    private final SLExpressionNode[] patternNodes;
    @Child
    private SLExpressionNode expr;

    public SLCaseExpression(SLExpressionNode[] branchNodes, SLExpressionNode[] patternNodes, SLExpressionNode expr) {
        this.branchNodes = branchNodes;
        this.patternNodes = patternNodes;
        this.expr = expr;
    }

    @Override
    public void setIsTail() {
        for (var branch : branchNodes) {
            branch.setIsTail();
        }
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        expr.executeVoid(frame);
        CompilerAsserts.compilationConstant(branchNodes.length);
        CompilerAsserts.compilationConstant(patternNodes.length);
        try {/////
            if (patternNodes[0].executeBoolean(frame)) {
                return branchNodes[0].executeGeneric(frame); /////
            }
        } catch (UnexpectedResultException e) {
                throw new RuntimeException("unreachable");
            }/////

//        try {
//            for (int i = 0; i < branchNodes.length; ++i) {
//                if ((boolean)patternNodes[i].executeGeneric(frame)) {
//                    return branchNodes[i].executeGeneric(frame);
//                }
//            }
        //} catch (UnexpectedResultException e) {
//            throw new RuntimeException("unreachable");
//        }
        throw new RuntimeException("match failure");
    }
}
