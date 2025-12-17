package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLSexp;

@NodeInfo(shortName = "sexp")
public class SLSexpNode extends SLExpressionNode {
    @Node.Children
    private final SLExpressionNode[] elementNodes;
    @CompilerDirectives.CompilationFinal
    private final long tag;

    public SLSexpNode(String tag, SLExpressionNode[] elementNodes) {
        this.elementNodes = elementNodes;
        this.tag = SLSexp.lTagHash(tag);
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(tag);
        CompilerAsserts.compilationConstant(elementNodes.length);
        Object[] results = new Object[elementNodes.length];
        for (int i = 0; i < elementNodes.length; ++i) {
            results[i] = elementNodes[i].executeGeneric(frame);
        }
        return new SLSexp(results, tag);
    }
}
