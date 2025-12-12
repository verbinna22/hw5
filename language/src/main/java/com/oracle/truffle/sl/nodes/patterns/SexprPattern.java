package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLSexp;

import java.util.Arrays;

import static com.oracle.truffle.sl.runtime.SLSexp.deHash;

public class SexprPattern extends SLPatternNode {
    private SLPatternNode[] nodes;
    private long tag;

    public SexprPattern(long tag, SLPatternNode[] nodes) {
        this.tag = tag;
        this.nodes = nodes;
    }

    @Override
    public boolean isMatch(Object value) {
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
            if (!nodes[i].isMatch(sexp.read(i))) {
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
