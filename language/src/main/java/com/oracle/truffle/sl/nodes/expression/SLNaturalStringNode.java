package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLExpressionNode;

@NodeInfo(shortName = "const")
public final class SLNaturalStringNode extends SLExpressionNode {
    private final StringBuilder value;

    public SLNaturalStringNode(StringBuilder value) {
        this.value = value;
    }

    @Override
    public StringBuilder executeGeneric(VirtualFrame frame) {
        return value;
    }
}
