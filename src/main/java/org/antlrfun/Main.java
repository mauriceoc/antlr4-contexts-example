package org.antlrfun;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    // Run this main method and watch System.out
    public static void main(String [] args) throws Exception {
        // First examine parseString method below and understand the steps

        // Parse two strings
        // See MyWalker class for how this works
        System.out.println("=== Contexts Example ===");
        parseString("cmd foo=pop");
        parseString("cmd foo=hey,ho,yo");

        // Parse invalid input
        // See MyErrorStrategy and MyErrorListener for this
        System.out.println("======= Error #1 =======");
        parseString("#");
        System.out.println("======= Error #2 =======");
        parseString("cmd #");
        System.out.println("======= Error #3 =======");
        parseString("cmd foo=#");
        System.out.println("======= Error #4 =======");
        parseString("cmd foo=");
        System.out.println("======= Error #5 =======");
        parseString("cmd =pop");
        System.out.println("======= Error #6 =======");
        parseString("cmd #=pop");
        System.out.println("======= Error #7 =======");
        parseString("# foo=pop");
    }

    public static void parseString(String s) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(s);

        MyLexer lexer = new MyLexer(antlrInputStream);
        // Remove the default error listener, which outputs to stderr
        lexer.removeErrorListeners();

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MyParser parser = new MyParser(tokens);
        // Remove the default error listener, which outputs to stderr
        parser.removeErrorListeners();

        // Setup custom error handling
        parser.setErrorHandler(new MyErrorStrategy());
        parser.addErrorListener(new MyErrorListener());

        ParseTree tree = null;
        try {
            tree = parser.command();
        } catch (ParseCancellationException e) {
            // Doing nothing with this exception
        }
        if(tree != null) {
            ParseTreeWalker walker = new ParseTreeWalker();
            MyWalker myWalker = new MyWalker();
            walker.walk(myWalker, tree);
        }
    }

}