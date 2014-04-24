// Generated from C:/projects/tor/repos/antlr4-maven-example/src/main/java/org/antlrfun\MyParser.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParser#listValueSubRule}.
	 * @param ctx the parse tree
	 */
	void enterListValueSubRule(@NotNull MyParser.ListValueSubRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#listValueSubRule}.
	 * @param ctx the parse tree
	 */
	void exitListValueSubRule(@NotNull MyParser.ListValueSubRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull MyParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull MyParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#cmdName}.
	 * @param ctx the parse tree
	 */
	void enterCmdName(@NotNull MyParser.CmdNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#cmdName}.
	 * @param ctx the parse tree
	 */
	void exitCmdName(@NotNull MyParser.CmdNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull MyParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull MyParser.CommandContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#simpleValueSubRule}.
	 * @param ctx the parse tree
	 */
	void enterSimpleValueSubRule(@NotNull MyParser.SimpleValueSubRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#simpleValueSubRule}.
	 * @param ctx the parse tree
	 */
	void exitSimpleValueSubRule(@NotNull MyParser.SimpleValueSubRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull MyParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull MyParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void enterSimpleValue(@NotNull MyParser.SimpleValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#simpleValue}.
	 * @param ctx the parse tree
	 */
	void exitSimpleValue(@NotNull MyParser.SimpleValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MyParser#nameValuePair}.
	 * @param ctx the parse tree
	 */
	void enterNameValuePair(@NotNull MyParser.NameValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParser#nameValuePair}.
	 * @param ctx the parse tree
	 */
	void exitNameValuePair(@NotNull MyParser.NameValuePairContext ctx);
}