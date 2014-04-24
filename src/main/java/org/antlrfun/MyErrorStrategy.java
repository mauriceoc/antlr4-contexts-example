package org.antlrfun;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class MyErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        System.out.println("reportError");
        for(String rule : recognizer.getRuleInvocationStack()) {
            System.out.println("Invalid: " + rule);
        }
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw new ParseCancellationException();
    }

}


