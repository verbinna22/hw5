package com.oracle.truffle.sl.runtime;

public class SLFunctionWithClosure {
    public SLClosure closure;
    public Object function;

    public SLFunctionWithClosure(SLClosure closure, Object function) {
        this.closure = closure;
        this.function = function;
    }
}
