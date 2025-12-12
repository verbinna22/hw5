package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;

public class BoxTagPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return !(value instanceof Long);
    }

    @Override
    public String toString() {
        return "#box";
    }
}
