package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLSexp;

public class SexpTagPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return value instanceof SLSexp;
    }
}
