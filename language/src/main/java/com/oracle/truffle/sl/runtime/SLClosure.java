package com.oracle.truffle.sl.runtime;

public class SLClosure {
    private final Object[] elements;

    public SLClosure(Object[] elements) {
        this.elements = elements;
    }

    public Object read(long index) {
        return index >= 0 && index < elements.length ? elements[(int)index] : SLNull.SINGLETON;
    }

    public void write(long index, Object value) {
        if (index >= 0 && index < elements.length) {
            elements[(int)index] = value;
        } else {
            throw new RuntimeException("Invalid index");
        }
    }

    public long length() {
        return elements.length;
    }
}
