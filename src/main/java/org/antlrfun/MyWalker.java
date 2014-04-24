package org.antlrfun;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class MyWalker extends MyParserBaseListener {

    private ParseTreeProperty<Object> contextMap = new ParseTreeProperty<>();

    @Override
    public void exitOption(@NotNull MyParser.OptionContext ctx) {
        // Remove name, using NameContext as key
        Object name = contextMap.removeFrom(ctx.name());
        // Remove value, using ValueContext as key
        Object value = contextMap.removeFrom(ctx.value());
        // Nothing remains on the map now
        // It is important that we clear the map entirely
        System.out.printf("name: %s\nvalue: %s\n", name, value);
    }

    @Override
    public void exitName(@NotNull MyParser.NameContext ctx) {
        // Add a string for this NameContext
        contextMap.put(ctx, ctx.ID());
    }

    @Override
    public void exitSimpleValueLR(@NotNull MyParser.SimpleValueLRContext ctx) {
        // Add a string for this SimpleValueLRContext, which extends ValueContext
        String string = ctx.simpleValue().ID().getText();
        contextMap.put(ctx, string);
    }

    @Override
    public void exitListValueLR(@NotNull MyParser.ListValueLRContext ctx) {
        // Add a string for this ListValueLRContext, which extends ValueContext
        List<String> stringList = new ArrayList<>(ctx.list().simpleValue().size());
        for(MyParser.SimpleValueContext simpleValueContext : ctx.list().simpleValue()) {
            stringList.add(simpleValueContext.ID().getText());
        }
        // Add an array of strings for this context
        contextMap.put(ctx, stringList);
    }
}
