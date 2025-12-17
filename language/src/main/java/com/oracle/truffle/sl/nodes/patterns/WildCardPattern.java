package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class WildCardPattern extends SLExpressionNode {
    @Override
    public String toString() {
        return "_";
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return true;
    }
}
