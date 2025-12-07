//package com.oracle.truffle.sl.nodes.local;
//
//import com.oracle.truffle.api.frame.VirtualFrame;
//import com.oracle.truffle.api.nodes.NodeInfo;
//import com.oracle.truffle.api.staticobject.StaticProperty;
//import com.oracle.truffle.api.strings.TruffleString;
//import com.oracle.truffle.sl.nodes.SLExpressionNode;
//import com.oracle.truffle.sl.runtime.SLContext;
//
//@NodeInfo(shortName = "readGlobal")
//public final class SLReadGlobalVariableNode extends SLExpressionNode {
//    private final StaticProperty globalVar;
//    private final Object staticStorage;
//
//    public SLReadGlobalVariableNode(TruffleString name) {
//        var context = SLContext.get(this);
//        this.staticStorage = context.getGlobal(name);
//        this.globalVar = context.globalVar;
//    }
//
//    @Override
//    public Object executeGeneric(VirtualFrame frame) {
//        return globalVar.getObject(staticStorage);
//    }
//}
