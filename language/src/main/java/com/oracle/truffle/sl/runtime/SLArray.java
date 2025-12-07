package com.oracle.truffle.sl.runtime;


import java.util.Arrays;
import java.util.stream.Collectors;

public final class SLArray {
    private final Object[] elements;

    public SLArray(Object[] elements) {
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

    @Override
    public String toString() {
        return "[" + Arrays.stream(elements).map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }
}
