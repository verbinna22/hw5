package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class DecimalPattern extends SLExpressionNode {
    private final long number;
    @Node.Child
    SLExpressionNode expression;

    public DecimalPattern(long number, SLExpressionNode expression) {
        this.number = number;
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        var value = expression.executeGeneric(frame);
        if (!(value instanceof Long l)) {
            return false;
        }
        return l == number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
