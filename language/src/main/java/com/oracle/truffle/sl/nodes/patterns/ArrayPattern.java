package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;
import com.oracle.truffle.sl.runtime.SLArray;

public class ArrayPattern extends SLPatternNode {
    private SLPatternNode[] nodes;

    public ArrayPattern(SLPatternNode[] nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean isMatch(Object value) {
        if (!(value instanceof SLArray array)) {
            return false;
        }
        if (array.length() != nodes.length) {
            return false;
        }
        for (int i = 0; i < nodes.length; ++i) {
            if (!nodes[i].isMatch(array.read(i))) {
                return false;
            }
        }
        return true;
    }
}
