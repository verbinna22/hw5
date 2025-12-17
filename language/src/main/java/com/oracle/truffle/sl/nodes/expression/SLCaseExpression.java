package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

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
        Object value = expr.executeGeneric(frame);
        CompilerAsserts.compilationConstant(branchNodes.length);
        CompilerAsserts.compilationConstant(patternNodes.length);
        for (int i = 0; i < branchNodes.length; ++i) {
//            System.out.println("val " + value.toString());/////
//            System.out.println("pat " + patternNodes[i].toString()); /////
            try {
                if (patternNodes[i].executeBoolean(frame)) {
                    return branchNodes[i].executeGeneric(frame);
                }
            } catch (UnexpectedResultException e) {
                throw new RuntimeException(e);
            }
        }
        throw new RuntimeException("match failure");
    }
}
