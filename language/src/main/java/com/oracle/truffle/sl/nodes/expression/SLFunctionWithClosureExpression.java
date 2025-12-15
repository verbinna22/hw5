package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLClosure;
import com.oracle.truffle.sl.runtime.SLFunctionWithClosure;

public final class SLFunctionWithClosureExpression extends SLExpressionNode {
    @Node.Child private SLExpressionNode closure;
    @Node.Child private SLExpressionNode function;

    public SLFunctionWithClosureExpression(SLExpressionNode closure, SLExpressionNode function) {
        this.closure = closure;
        this.function = function;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var func = function.executeGeneric(frame);
        var clos = (closure == null) ? null : (SLClosure)closure.executeGeneric(frame);
        return new SLFunctionWithClosure(clos, func);
    }
}
