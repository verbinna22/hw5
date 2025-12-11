package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

@NodeInfo(shortName = "case", description = "The node implementing a match statement")
public final class SLCaseExpression extends SLExpressionNode {
    @Node.Children
    private final SLExpressionNode[] branchNodes;
    private final SLPatternNode[] patternNodes;
    private final SLExpressionNode expr;

    public SLCaseExpression(SLExpressionNode[] branchNodes, SLPatternNode[] patternNodes, SLExpressionNode expr) {
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
        for (int i = 0; i < branchNodes.length; ++i) {
            if (patternNodes[i].isMatch(value)) {
                return branchNodes[i].executeGeneric(frame);
            }
        }
        throw new RuntimeException("match failure");
    }
}
