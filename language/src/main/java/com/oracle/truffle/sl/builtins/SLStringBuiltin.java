package com.oracle.truffle.sl.builtins;

import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.runtime.SLArray;
import com.oracle.truffle.sl.runtime.SLSexp;

@NodeInfo(shortName = "string")
public abstract class SLStringBuiltin  extends SLBuiltinNode {
    @Specialization
    protected Object doDefault(SLArray array) {
        return toString(array);
    }

    @Specialization
    protected Object doDefault(long value) {
        return toString(value);
    }

    @Specialization
    protected Object doDefault(SLSexp sexp) {
        return toString(sexp);
    }

    @Specialization
    protected Object doDefault(StringBuilder string) {
        return new StringBuilder(string).append('"').insert(0, '"');
    }

    public static StringBuilder toString(Object elem) {
        if (elem instanceof StringBuilder string) {
            return new StringBuilder(string).append('"').insert(0, '"');
        }
        return new StringBuilder(elem.toString());
    }
}
