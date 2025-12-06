package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.sl.nodes.SLExpressionNode;

public final class SLSeqNode extends SLExpressionNode {
    @Child private SLExpressionNode left;
    @Child private SLExpressionNode right;

    public SLSeqNode(SLExpressionNode left, SLExpressionNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void executeVoid(VirtualFrame frame) {
        left.executeVoid(frame);
        right.executeVoid(frame);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        left.executeVoid(frame);
        return right.executeGeneric(frame);
    }

    @Override
    public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        left.executeVoid(frame);
        return right.executeLong(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
        left.executeVoid(frame);
        return right.executeBoolean(frame);
    }
}
