package com.oracle.truffle.sl.nodes.local;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLContext;
import com.oracle.truffle.sl.runtime.SLNull;

@NodeInfo(shortName = "readGlobal")
public final class SLReadGlobalVariableNode extends SLExpressionNode {
    private final int globalVarId;
    private final SLContext context;

    public SLReadGlobalVariableNode(int id) {
        context = SLContext.get(this);
        globalVarId = id;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var result = context.globalsObject.globals[globalVarId];
        if (result == null) {
            return SLNull.SINGLETON;
        }
        return result;
    }
}
