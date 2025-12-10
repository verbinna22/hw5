package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class StrTagPattern extends SLPatternNode {
    @Override
    public boolean isMatch(Object value) {
        return value instanceof TruffleString;
    }
}
