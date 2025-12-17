package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLArray;

public class ArrayTagPattern extends SLExpressionNode {
    @Node.Child
    SLExpressionNode expression;

    public ArrayTagPattern(SLExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "#array";
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return expression.executeGeneric(frame) instanceof SLArray;
    }
}
