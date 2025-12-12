package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class StringPattern extends SLPatternNode {
    private final String string;

    public StringPattern(String string) {
        this.string = string;
    }

    @Override
    public boolean isMatch(Object value) {
        if (!(value instanceof StringBuilder s)){
            return false;
        }
        return s.toString().equals(string);
    }

    @Override
    public String toString() {
        return "\"" + string + "\"";
    }
}
