package org.antlrfun;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

// Use this class to listen to the Parser Errors, print them, whatever
public class MyErrorListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
       System.out.println(msg);
       printExpectedTokens((Parser) recognizer);
    }

    // Print tokens the parser expects, just to show we can
    private void printExpectedTokens(Parser parser) {
        for(int i : parser.getExpectedTokensWithinCurrentRule().toList()) {
            String expectedToken = parser.getTokenNames()[i];
            System.out.println("Expected " + expectedToken);
        }
    }

}

