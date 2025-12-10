package com.oracle.truffle.sl.nodes.local;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.staticobject.StaticProperty;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLContext;

public final class SLWriteGlobalVariableNode extends SLExpressionNode {
    private final int globalVarId;
    private final SLContext context;
    private final SLExpressionNode valueNode;

    public SLWriteGlobalVariableNode(int id, SLExpressionNode expr) {
        this.valueNode = expr;
        context = SLContext.get(this);
        globalVarId = id;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        var result = valueNode.executeGeneric(frame);
        context.globalsObject.globals[globalVarId] = result;
        return result;
    }
}
