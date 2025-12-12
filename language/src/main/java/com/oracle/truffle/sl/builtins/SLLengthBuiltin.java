package com.oracle.truffle.sl.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.runtime.SLArray;
import com.oracle.truffle.sl.runtime.SLContext;
import com.oracle.truffle.sl.runtime.SLNull;
import com.oracle.truffle.sl.runtime.SLSexp;

@NodeInfo(shortName = "length")
public abstract class SLLengthBuiltin extends SLBuiltinNode {
    @Specialization
    protected long doLong(SLArray array) {
        return array.length();
    }

    @Specialization
    protected long doLong(SLSexp sexp) {
        return sexp.length();
    }

    @Specialization
    protected long doLong(StringBuilder string) {
        return string.toString().length();
    }
}
