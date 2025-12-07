//package com.oracle.truffle.sl.runtime;
//
//import com.oracle.truffle.api.CompilerDirectives;
//import com.oracle.truffle.api.TruffleLanguage;
//import com.oracle.truffle.api.dsl.Bind;
//import com.oracle.truffle.api.dsl.Cached;
//import com.oracle.truffle.api.interop.InteropLibrary;
//import com.oracle.truffle.api.interop.InvalidArrayIndexException;
//import com.oracle.truffle.api.interop.TruffleObject;
//import com.oracle.truffle.api.interop.UnknownIdentifierException;
//import com.oracle.truffle.api.library.ExportLibrary;
//import com.oracle.truffle.api.library.ExportMessage;
//import com.oracle.truffle.api.nodes.Node;
//import com.oracle.truffle.api.profiles.InlinedBranchProfile;
//import com.oracle.truffle.api.strings.TruffleString;
//import com.oracle.truffle.sl.SLLanguage;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@ExportLibrary(InteropLibrary.class)
//public final class GlobalsObject  implements TruffleObject {
//    final Map<TruffleString, Object> globals = new HashMap<>();
//
//    GlobalsObject() {
//    }
//
//    @ExportMessage
//    boolean hasLanguage() {
//        return true;
//    }
//
//    @ExportMessage
//    Class<? extends TruffleLanguage<?>> getLanguage() {
//        return SLLanguage.class;
//    }
//
//    @ExportMessage
//    boolean hasMembers() {
//        return true;
//    }
//
//    @ExportMessage
//    @CompilerDirectives.TruffleBoundary
//    Object readMember(String member) throws UnknownIdentifierException {
//        Object value = globals.get(SLStrings.fromJavaString(member));
//        if (value != null) {
//            return value;
//        }
//        throw UnknownIdentifierException.create(member);
//    }
//
//    @ExportMessage
//    @CompilerDirectives.TruffleBoundary
//    boolean isMemberReadable(String member) {
//        return globals.containsKey(SLStrings.fromJavaString(member));
//    }
//
//    @ExportMessage
//    @CompilerDirectives.TruffleBoundary
//    Object getMembers(@SuppressWarnings("unused") boolean includeInternal) {
//        return new GlobalsObject.GlobalNamesObject(globals.keySet().toArray());
//    }
//
//    @ExportMessage
//    boolean hasMetaObject() {
//        return true;
//    }
//
//    @ExportMessage
//    Object getMetaObject() {
//        return SLType.OBJECT;
//    }
//
//    @ExportMessage
//    boolean isScope() {
//        return true;
//    }
//
//    @ExportMessage
//    @CompilerDirectives.TruffleBoundary
//    Object toDisplayString(@SuppressWarnings("unused") boolean allowSideEffects) {
//        return "global";
//    }
//
//    public static boolean isInstance(TruffleObject obj) {
//        return obj instanceof GlobalsObject;
//    }
//
//    @ExportLibrary(InteropLibrary.class)
//    static final class GlobalNamesObject implements TruffleObject {
//
//        private final Object[] names;
//
//        GlobalNamesObject(Object[] names) {
//            this.names = names;
//        }
//
//        @ExportMessage
//        boolean hasArrayElements() {
//            return true;
//        }
//
//        @ExportMessage
//        boolean isArrayElementReadable(long index) {
//            return index >= 0 && index < names.length;
//        }
//
//        @ExportMessage
//        long getArraySize() {
//            return names.length;
//        }
//
//        @ExportMessage
//        Object readArrayElement(long index, @Bind Node node, @Cached InlinedBranchProfile error) throws InvalidArrayIndexException {
//            if (!isArrayElementReadable(index)) {
//                error.enter(node);
//                throw InvalidArrayIndexException.create(index);
//            }
//            return names[(int) index];
//        }
//    }
//}
