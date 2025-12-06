package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLStatementNode;

@NodeInfo(shortName = "while", description = "The node implementing a while loop")
public class SLWhileExpression extends SLExpressionNode {
    @Child private LoopNode loopNode;

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        loopNode.execute(frame);
        return null;
    }

    public SLWhileExpression(SLExpressionNode conditionNode, SLStatementNode bodyNode) {
        this.loopNode = Truffle.getRuntime().createLoopNode(new SLWhileRepeatingNode(conditionNode, bodyNode));
    }
}
