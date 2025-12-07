package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLNull;

@NodeInfo(shortName = "skip", description = "The node implementing a skip")
public class SLSkipExpression extends SLExpressionNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return SLNull.SINGLETON;
    }
}
