package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLFunctionWithClosure;

public class FunTagPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return value instanceof SLFunctionWithClosure;
    }

    @Override
    public String toString() {
        return "#fun";
    }
}
