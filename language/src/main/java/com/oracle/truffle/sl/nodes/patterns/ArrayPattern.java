package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.CompilerAsserts;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLArray;

import java.util.Arrays;

import static com.oracle.truffle.sl.runtime.SLSexp.deHash;

public class ArrayPattern extends SLExpressionNode {
    @Child SLExpressionNode expression;
    @Children private SLExpressionNode[] nodes;

    public ArrayPattern(SLExpressionNode[] nodes, SLExpressionNode expression) {
        this.nodes = nodes;
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    @ExplodeLoop
    public boolean executeBoolean(VirtualFrame frame) {
        CompilerAsserts.compilationConstant(nodes.length);
        var value = expression.executeGeneric(frame);
        if (!(value instanceof SLArray array)) {
            return false;
        }
        if (array.length() != nodes.length) {
            return false;
        }
        for (int i = 0; i < nodes.length; ++i) {
            try {
                if (!nodes[i].executeBoolean(frame)) {
                    return false;
                }
            } catch (UnexpectedResultException e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[");
        for (var node : nodes) {
            res.append(node.toString());
        }
        res.append("]");
        return res.toString();
    }
}
