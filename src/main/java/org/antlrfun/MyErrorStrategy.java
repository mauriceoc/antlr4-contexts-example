package org.antlrfun;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.lang.*;
import java.util.List;

// Crush all error handling from ANTLR and route it through custom code
public class MyErrorStrategy extends DefaultErrorStrategy {

    @Override
    protected void reportNoViableAlternative(@NotNull Parser parser, @NotNull NoViableAltException e) {
        handleError(parser);
    }

    @Override
    protected void reportInputMismatch(@NotNull Parser parser, @NotNull InputMismatchException e) {
        handleError(parser);
    }

    @Override
    protected void reportMissingToken(@NotNull Parser parser) {
        handleError(parser);
    }

    @Override
    protected void reportUnwantedToken(@NotNull Parser parser) {
        handleError(parser);
    }

    @Override
    protected void reportFailedPredicate(@NotNull Parser parser, @NotNull FailedPredicateException e) {
        handleError(parser);
    }

    private void handleError(Parser parser) {
        handleError(parser, null);
    }
    // Change error messages here
    private void handleError(Parser parser, RecognitionException e) {

        List<String> stack = parser.getRuleInvocationStack();

        for(String s : stack) {
            Error error = Error.getError(s);
            if(error != null) {
                if(e == null) {
                    parser.notifyErrorListeners(error.getErrorMessage());
                } else {
                    parser.notifyErrorListeners(e.getOffendingToken(), error.getErrorMessage(), e);
                }
            }
        }

        // Cancel the parse after the first error
        throw new ParseCancellationException();
    }
}



