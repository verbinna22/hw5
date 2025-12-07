package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLStatementNode;
import com.oracle.truffle.sl.runtime.SLNull;

@NodeInfo(shortName = "dowhile", description = "The node implementing a do while loop")
public class SLDoWhileExpression extends SLExpressionNode {
    @Node.Child
    private LoopNode loopNode;

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        loopNode.execute(frame);
        return SLNull.SINGLETON;
    }

    public SLDoWhileExpression(SLExpressionNode conditionNode, SLStatementNode bodyNode) {
        this.loopNode = Truffle.getRuntime().createLoopNode(new SLDoWhileRepeatingNode(conditionNode, bodyNode));
    }
}
