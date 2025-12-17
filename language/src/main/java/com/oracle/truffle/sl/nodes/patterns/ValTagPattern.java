package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.sl.nodes.SLExpressionNode;

public class ValTagPattern extends SLExpressionNode {
    @Child SLExpressionNode expression;

    public ValTagPattern(SLExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "#val";
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return expression.executeGeneric(frame) instanceof Long;
    }
}
