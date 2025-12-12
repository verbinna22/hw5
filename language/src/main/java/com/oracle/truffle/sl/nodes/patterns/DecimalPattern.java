package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.sl.nodes.SLPatternNode;

public class DecimalPattern extends SLPatternNode {
    private final long number;

    public DecimalPattern(long number) {
        this.number = number;
    }

    @Override
    public boolean isMatch(Object value) {
        if (!(value instanceof Long l)) {
            return false;
        }
        return l == number;
    }

    @Override
    public String toString() {
        return "" + number;
    }
}
