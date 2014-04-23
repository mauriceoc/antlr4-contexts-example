package org.antlrfun;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String [] args) throws Exception {
        System.out.println("=== Contexts Example ===");

        // Parse two strings
        // See MyWalker class for how this works

        // This should print a single string
        parseString("foo=bar");

        // This should print an array object
        parseString("pop=hey,ho,yo");
    }

    public static void parseString(String s) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(s);

        MyLexer lexer = new MyLexer(antlrInputStream);

        CommonTokenStream tokens = new CommonTokenStream( lexer );
        MyParser parser = new MyParser( tokens );

        ParseTree tree = parser.nameValuePair();

        ParseTreeWalker walker = new ParseTreeWalker();

        MyWalker myWalker = new MyWalker();

        walker.walk(myWalker, tree);
    }
}