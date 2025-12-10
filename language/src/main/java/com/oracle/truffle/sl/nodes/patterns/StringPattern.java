package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class StringPattern extends SLPatternNode {
    private final TruffleString string;

    public StringPattern(TruffleString string) {
        this.string = string;
    }

    @Override
    public boolean isMatch(Object value) {
        if (!(value instanceof TruffleString s)){
            return false;
        }
        return s.equals(string);
    }
}
