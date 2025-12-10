package com.oracle.truffle.sl.runtime;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SLSexp {
    private final long tag;
    private final Object[] elements;

    public SLSexp(Object[] elements, long tag) {
        this.elements = elements;
        this.tag = tag;
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

    public long getTag() { return tag; }

    @Override
    public String toString() {
        return deHash(tag) + "(" + Arrays.stream(elements).map(Object::toString).collect(Collectors.joining(", ")) + ")";
    }

    static final char[] chars = "_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789'".toCharArray();
    static final int MAX_SEXP_TAGLEN = 10;

    public static long lTagHash (String s) {
        char[] sArr = s.toCharArray();

        int p;
        long  h = 0;
        long limit = 0;

        p = 0;
        while (p < sArr.length && limit++ < MAX_SEXP_TAGLEN) {
            int q   = 0;
            long   pos = 0;
            for (; q < chars.length && chars[q] != sArr[p]; q++, pos++) ;
            if (q < chars.length) h = (h << 6) | pos;
            else throw new RuntimeException("invalid tag");
            p++;
        }
        assert s.equals(deHash(h));
        return h;
    }

    public static String deHash (long n) {
        char[] buf = new char[MAX_SEXP_TAGLEN];
        int p;
        p                  = MAX_SEXP_TAGLEN - 1;
        while (n != 0) {
            buf[p--] = chars[(int)(n & 0b111111)];
            n    = n >> 6;
        }
        ++p;
        return new String(buf, p, buf.length - p);
    }
}
