package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class StrTagPattern extends SLExpressionNode {
    @Child SLExpressionNode expression;

    public StrTagPattern(SLExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return expression.executeGeneric(frame) instanceof StringBuilder;
    }

    @Override
    public String toString() {
        return "#str";
    }
}
