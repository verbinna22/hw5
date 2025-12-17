package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.CountingConditionProfile;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLStatementNode;
import com.oracle.truffle.sl.nodes.util.SLToBooleanNodeGen;
import com.oracle.truffle.sl.nodes.util.SLUnboxNodeGen;
import com.oracle.truffle.sl.runtime.SLNull;

@NodeInfo(shortName = "if", description = "The node implementing a condional statement")
public final class SLIfExpression extends SLExpressionNode {
    @Child private SLExpressionNode conditionNode;

    /** Statement (or {@link}) executed when the condition is true. */
    @Child private SLExpressionNode thenPartNode;

    /** Statement (or {@link}) executed when the condition is false. */
    @Child private SLExpressionNode elsePartNode;

    /**
     * Profiling information, collected by the interpreter, capturing the profiling information of
     * the condition. This allows the compiler to generate better code for conditions that are
     * always true or always false. Additionally the {@link CountingConditionProfile} implementation
     * (as opposed to {@link BinaryConditionProfile} implementation) transmits the probability of
     * the condition to be true to the compiler.
     */
    private final CountingConditionProfile condition = CountingConditionProfile.create();

    @Override
    public void setIsTail() {
        thenPartNode.setIsTail();
        if (elsePartNode != null) {
            elsePartNode.setIsTail();
        }
    }

    public SLIfExpression(SLExpressionNode conditionNode, SLExpressionNode thenPartNode, SLExpressionNode elsePartNode) {
        this.conditionNode = SLUnboxNodeGen.create(conditionNode);
        this.conditionNode.setSourceSection(conditionNode.getSourceCharIndex(), conditionNode.getSourceLength());
        this.thenPartNode = thenPartNode;
        this.elsePartNode = elsePartNode;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        /*
         * In the interpreter, record profiling information that the condition was executed and with
         * which outcome.
         */
        if (condition.profile(evaluateCondition(frame))) {
            /* Execute the then-branch. */
            return thenPartNode.executeGeneric(frame);
        } else {
            /* Execute the else-branch (which is optional according to the SL syntax). */
            if (elsePartNode != null) {
                return elsePartNode.executeGeneric(frame);
            }
        }
        return SLNull.SINGLETON;
    }

    @Override
    public void executeVoid(VirtualFrame frame) {
        /*
         * In the interpreter, record profiling information that the condition was executed and with
         * which outcome.
         */
        if (condition.profile(evaluateCondition(frame))) {
            /* Execute the then-branch. */
            thenPartNode.executeVoid(frame);
        } else {
            /* Execute the else-branch (which is optional according to the SL syntax). */
            if (elsePartNode != null) {
                elsePartNode.executeVoid(frame);
            }
        }
    }

    @Override
    public long executeLong(VirtualFrame frame) throws UnexpectedResultException {
        /*
         * In the interpreter, record profiling information that the condition was executed and with
         * which outcome.
         */
        if (condition.profile(evaluateCondition(frame))) {
            /* Execute the then-branch. */
            return thenPartNode.executeLong(frame);
        } else {
            /* Execute the else-branch (which is optional according to the SL syntax). */
            if (elsePartNode != null) {
                return elsePartNode.executeLong(frame);
            }
        }
        return 0;
    }

    @Override
    public boolean executeBoolean(VirtualFrame frame) throws UnexpectedResultException {
        /*
         * In the interpreter, record profiling information that the condition was executed and with
         * which outcome.
         */
        if (condition.profile(evaluateCondition(frame))) {
            /* Execute the then-branch. */
            return thenPartNode.executeBoolean(frame);
        } else {
            /* Execute the else-branch (which is optional according to the SL syntax). */
            if (elsePartNode != null) {
                return elsePartNode.executeBoolean(frame);
            }
        }
        return false;
    }

    private boolean evaluateCondition(VirtualFrame frame) {
        try {
            /*
             * The condition must evaluate to a boolean value, so we call the boolean-specialized
             * execute method.
             */
            var res = conditionNode.executeLong(frame) != 0;
            //System.out.println("result:" + res);///
            return res;
        } catch (UnexpectedResultException ex) {
            throw CompilerDirectives.shouldNotReachHere(ex);
        }
    }
}
