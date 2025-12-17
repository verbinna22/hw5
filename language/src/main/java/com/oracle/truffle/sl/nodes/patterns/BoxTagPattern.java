package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class BoxTagPattern extends SLExpressionNode {
    @Node.Child
    SLExpressionNode expression;

    public BoxTagPattern(SLExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "#box";
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return !(expression.executeGeneric(frame) instanceof Long);
    }
}
