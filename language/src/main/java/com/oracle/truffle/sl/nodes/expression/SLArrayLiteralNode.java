package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLArray;

import java.util.Arrays;

@NodeInfo(shortName = "array")
public class SLArrayLiteralNode extends SLExpressionNode {
    @Children private final SLExpressionNode[] elementNodes;

    public SLArrayLiteralNode(SLExpressionNode[] elementNodes) {
        this.elementNodes = elementNodes;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var result = Arrays.stream(elementNodes).map(n -> n.executeGeneric(frame)).toArray();
        return new SLArray(result);
    }
}