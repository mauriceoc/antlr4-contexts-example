package org.antlrfun;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String [] args) throws Exception {
        // Parse two strings
        // See MyWalker class for how this works
        System.out.println("=== Contexts Example ===");
        parseString("cmd foo=pop");
        parseString("cmd foo=hey,ho,yo");

        // Parse stuff with errors
        System.out.println("======= Error #1 =======");
        parseString("cmd #");
        System.out.println("======= Error #2 =======");
        parseString("cmd foo=");
        System.out.println("======= Error #3 =======");
        parseString("cmd =pop");

    }

    public static void parseString(String s) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(s);

        MyLexer lexer = new MyLexer(antlrInputStream);

        lexer.removeErrorListeners(); // remove the default error listener

        CommonTokenStream tokens = new CommonTokenStream( lexer );

        MyParser parser = new MyParser( tokens );
        parser.setErrorHandler(new MyErrorStrategy());

        parser.removeErrorListeners(); // remove the default error listener

        ParseTree tree = null;
        try {
            tree = parser.command();
        } catch (ParseCancellationException e) {

        }

        if(tree != null) {
            ParseTreeWalker walker = new ParseTreeWalker();
            MyWalker myWalker = new MyWalker();
            walker.walk(myWalker, tree);
        }
    }
}