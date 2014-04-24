// Generated from C:/projects/tor/repos/antlr4-maven-example/src/main/java/org/antlrfun\MyParser.g4 by ANTLR 4.x
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyParser#listValueSubRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValueSubRule(@NotNull MyParser.ListValueSubRuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull MyParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#cmdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdName(@NotNull MyParser.CmdNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(@NotNull MyParser.CommandContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#simpleValueSubRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleValueSubRule(@NotNull MyParser.SimpleValueSubRuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull MyParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#simpleValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleValue(@NotNull MyParser.SimpleValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link MyParser#nameValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameValuePair(@NotNull MyParser.NameValuePairContext ctx);
}