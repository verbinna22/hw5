package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLClosure;

import java.util.Arrays;

@NodeInfo(shortName = "closureLiteral")
public final class SLClosureLiteralNode extends SLExpressionNode {
    @Children private final SLExpressionNode[] elementNodes;

    public SLClosureLiteralNode(SLExpressionNode[] elementNodes) {
        this.elementNodes = elementNodes;
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(elementNodes.length);
        Object[] results = new Object[elementNodes.length];
        for (int i = 0; i < elementNodes.length; ++i) {
            results[i] = elementNodes[i].executeGeneric(frame);
        }
        return new SLClosure(results);
    }
}
