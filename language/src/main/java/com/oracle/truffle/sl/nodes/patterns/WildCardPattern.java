package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;

public class WildCardPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return true;
    }
}
