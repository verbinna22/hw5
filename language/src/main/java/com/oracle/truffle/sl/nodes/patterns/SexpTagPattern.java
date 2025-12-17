package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLSexp;

public class SexpTagPattern extends SLExpressionNode {
    @Child SLExpressionNode expression;

    public SexpTagPattern(SLExpressionNode expression) {
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        return expression.executeGeneric(frame) instanceof SLSexp;
    }

    @Override
    public String toString() {
        return "#sexp";
    }
}
