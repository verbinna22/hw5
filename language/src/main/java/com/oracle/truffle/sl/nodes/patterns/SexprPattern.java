package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLSexp;

import java.util.Arrays;

import static com.oracle.truffle.sl.runtime.SLSexp.deHash;

public class SexprPattern extends SLExpressionNode {
    @Child SLExpressionNode expression;
    @Children private SLExpressionNode[] nodes;
    private long tag;

    public SexprPattern(long tag, SLExpressionNode[] nodes, SLExpressionNode expression) {
        this.tag = tag;
        this.nodes = nodes;
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        var value = expression.executeGeneric(frame);
        if (!(value instanceof SLSexp sexp)) {
            return false;
        }
        if (sexp.getTag() != tag) {
            return false;
        }
        if (sexp.length() != nodes.length) {
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
        StringBuilder res = new StringBuilder(deHash(tag) + "(");
        for (var node : nodes) {
            res.append(node.toString());
        }
        res.append(")");
        return res.toString();
    }
}
