//package com.oracle.truffle.sl.nodes.local;
//
//import com.oracle.truffle.api.frame.VirtualFrame;
//import com.oracle.truffle.api.staticobject.StaticProperty;
//import com.oracle.truffle.api.strings.TruffleString;
//import com.oracle.truffle.sl.nodes.SLExpressionNode;
//import com.oracle.truffle.sl.runtime.SLContext;
//
//public final class SLWriteGlobalVariableNode extends SLExpressionNode {
//    @Child private SLExpressionNode valueNode;
//    private final StaticProperty globalVar;
//    private final Object staticStorage;
//
//    public SLWriteGlobalVariableNode(TruffleString name, SLExpressionNode expr) {
//        this.valueNode = expr;
//        var context = SLContext.get(this);
//        this.staticStorage = context.getGlobal(name);
//        this.globalVar = context.globalVar;
//    }
//
//    @Override
//    public Object executeGeneric(VirtualFrame frame) {
//        var result = valueNode.executeGeneric(frame);
//        globalVar.setObject(staticStorage, result);
//        return result;
//    }
//}
