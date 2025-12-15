package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.runtime.SLSexp;

import java.util.Arrays;

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
    public Object executeGeneric(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(tag);
        CompilerAsserts.compilationConstant(elementNodes.length);
        var result = Arrays.stream(elementNodes).map(n -> n.executeGeneric(frame)).toArray();
        return new SLSexp(result, tag);
    }
}
