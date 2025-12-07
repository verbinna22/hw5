package com.oracle.truffle.sl.nodes.expression;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RepeatingNode;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.BranchProfile;
import com.oracle.truffle.sl.nodes.SLExpressionNode;
import com.oracle.truffle.sl.nodes.SLStatementNode;
import com.oracle.truffle.sl.nodes.controlflow.SLBreakException;
import com.oracle.truffle.sl.nodes.controlflow.SLContinueException;
import com.oracle.truffle.sl.nodes.util.SLToBooleanNodeGen;
import com.oracle.truffle.sl.nodes.util.SLUnboxNodeGen;

public final class SLDoWhileRepeatingNode  extends Node implements RepeatingNode {
    /**
     * The condition of the loop. This in a {@link SLExpressionNode} because we require a result
     * value. We do not have a node type that can only return a {@code boolean} value, so
     * {@link #evaluateCondition executing the condition} can lead to a type error.
     */
    @Child private SLExpressionNode conditionNode;

    /** Statement (or {@link}) executed as long as the condition is true. */
    @Child private SLStatementNode bodyNode;

    /**
     * Profiling information, collected by the interpreter, capturing whether a {@code continue}
     * statement was used in this loop. This allows the compiler to generate better code for loops
     * without a {@code continue}.
     */
    private final BranchProfile continueTaken = BranchProfile.create();
    private final BranchProfile breakTaken = BranchProfile.create();

    public SLDoWhileRepeatingNode(SLExpressionNode conditionNode, SLStatementNode bodyNode) {
        this.conditionNode = SLToBooleanNodeGen.create(SLUnboxNodeGen.create(conditionNode));
        this.conditionNode.setSourceSection(conditionNode.getSourceCharIndex(), conditionNode.getSourceLength());
        this.bodyNode = bodyNode;
    }

    @Override
    public boolean executeRepeating(VirtualFrame frame) {
        try {
            /* Execute the loop body. */
            bodyNode.executeVoid(frame);
            /* Continue with next loop iteration. */
        } catch (SLContinueException ex) {
            /* In the interpreter, record profiling information that the loop uses continue. */
            continueTaken.enter();
            /* Continue with next loop iteration. */
            return true;

        } catch (SLBreakException ex) {
            /* In the interpreter, record profiling information that the loop uses break. */
            breakTaken.enter();
            /* Break out of the loop. */
            return false;
        }
        return evaluateCondition(frame);
    }

    private boolean evaluateCondition(VirtualFrame frame) {
        try {
            /*
             * The condition must evaluate to a boolean value, so we call the boolean-specialized
             * execute method.
             */
            return conditionNode.executeBoolean(frame);
        } catch (UnexpectedResultException ex) {
            throw CompilerDirectives.shouldNotReachHere(ex);
        }
    }

    @Override
    public String toString() {
        return SLStatementNode.formatSourceSection(this);
    }
}
