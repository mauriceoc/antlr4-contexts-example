package org.antlrfun;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.List;


public class MyErrorStrategy extends DefaultErrorStrategy {

    // Change how Errors are reported here
    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        List<String> stack = recognizer.getRuleInvocationStack();
        for(String s : stack) {
            recognizer.notifyErrorListeners(e.getOffendingToken(), "Invalid: " + s, e);
        }
    }

    @Override
    protected void reportNoViableAlternative(@NotNull Parser recognizer, @NotNull NoViableAltException e) {
        // Blank method
        // Leave this overridden as we don't want ANTLR to report it
    }

    @Override
    protected void reportInputMismatch(@NotNull Parser recognizer, @NotNull InputMismatchException e) {
        // Blank method
        // Leave this overridden as we don't want ANTLR to report it
    }

    @Override
    protected void reportMissingToken(@NotNull Parser recognizer) {
        // Blank method
        // Leave this overridden as we don't want ANTLR to report it
    }

    @Override
    protected void reportUnwantedToken(@NotNull Parser recognizer) {
        // Blank method
        // Leave this overridden as we don't want ANTLR to report it
    }

    @Override
    protected void reportFailedPredicate(@NotNull Parser recognizer, @NotNull FailedPredicateException e) {
        // Blank method
        // Leave this overridden as we don't want ANTLR to report it
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw new ParseCancellationException();
    }
}



