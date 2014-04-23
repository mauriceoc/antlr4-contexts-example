package org.antlrfun;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.List;

public class MyWalker extends MyParserBaseListener {

    private ParseTreeProperty<Object> contextMap = new ParseTreeProperty<>();

    @Override
    public void exitNameValuePair(@NotNull MyParser.NameValuePairContext ctx) {
        // Use NameContext as key
        Object name = contextMap.get(ctx.name());
        // Use ValueContext as key
        Object value = contextMap.get(ctx.value());
        // Nothing remains on the map now
        System.out.printf("name: %s\nvalue: %s\n", name, value);
    }

    @Override
    public void exitName(@NotNull MyParser.NameContext ctx) {
        // Add a string for this NameContext
        contextMap.put(ctx, ctx.ID());
    }

    @Override
    public void exitSimpleValueSubRule(@NotNull MyParser.SimpleValueSubRuleContext ctx) {
        // Add a string for this SimpleValueSubRuleContext, which extends ValueContext
        contextMap.put(ctx, ctx.simpleValue().ID().getText());
    }

    @Override
    public void exitListValueSubRule(@NotNull MyParser.ListValueSubRuleContext ctx) {
        // Add a string for this ListValueSubRuleContext, which extends ValueContext
        List<String> stringsList = new ArrayList<String>(ctx.list().simpleValue().size());
        for(MyParser.SimpleValueContext simpleValueContext : ctx.list().simpleValue()) {
            stringsList.add(simpleValueContext.ID().getText());
        }
        // Add an array of strings for this context
        contextMap.put(ctx, stringsList);
    }
}
