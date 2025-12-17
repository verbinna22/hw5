package com.oracle.truffle.sl.nodes.patterns;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.strings.TruffleString;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLPatternNode;

public class StringPattern extends SLExpressionNode {
    @Node.Child
    SLExpressionNode expression;

    private final String string;

    public StringPattern(String string, SLExpressionNode expression) {
        this.string = string;
        this.expression = expression;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return executeBoolean(frame);
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) {
        var value = expression.executeGeneric(frame);
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
