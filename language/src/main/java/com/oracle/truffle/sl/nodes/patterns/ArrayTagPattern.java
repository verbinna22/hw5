package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLArray;

public class ArrayTagPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return value instanceof SLArray;
    }

    @Override
    public String toString() {
        return "#array";
    }
}
