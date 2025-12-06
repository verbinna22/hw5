package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.bytecode.OperationProxy;
import com.oracle.truffle.api.dsl.Bind;
import com.oracle.truffle.api.dsl.Fallback;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.interop.InteropLibrary;
import com.oracle.truffle.api.interop.UnsupportedMessageException;
import com.oracle.truffle.api.library.CachedLibrary;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.sl.SLException;
import com.oracle.truffle.sl.nodes.SLBinaryNode;
import com.oracle.truffle.sl.runtime.SLBigInteger;

import static com.oracle.truffle.api.CompilerDirectives.shouldNotReachHere;

@NodeInfo(shortName = "%")
@OperationProxy.Proxyable(allowUncached = true)
public abstract class SLModNode extends SLBinaryNode {

    @Specialization(rewriteOn = ArithmeticException.class)
    public static long doLong(long left, long right) {
        return left % right;
    }

    @Specialization(replaces = "doLong")
    @CompilerDirectives.TruffleBoundary
    public static SLBigInteger doSLBigInteger(SLBigInteger left, SLBigInteger right) {
        return new SLBigInteger(left.getValue().mod(right.getValue()));
    }

    @Specialization(replaces = "doSLBigInteger", guards = {"leftLibrary.fitsInBigInteger(left)", "rightLibrary.fitsInBigInteger(right)"}, limit = "3")
    @CompilerDirectives.TruffleBoundary
    public static SLBigInteger doInteropBigInteger(Object left, Object right,
                                                   @CachedLibrary("left") InteropLibrary leftLibrary,
                                                   @CachedLibrary("right") InteropLibrary rightLibrary) {
        try {
            return new SLBigInteger(leftLibrary.asBigInteger(left).mod(rightLibrary.asBigInteger(right)));
        } catch (UnsupportedMessageException e) {
            throw shouldNotReachHere(e);
        }
    }

    @Fallback
    public static Object typeError(Object left, Object right, @Bind Node node) {
        throw SLException.typeError(node, "%", left, right);
    }

}
