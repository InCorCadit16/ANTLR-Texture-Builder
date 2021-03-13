package gen;// Generated from C:/Users/Admin/source/repos/lang/src\lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link langParser}.
 */
public interface langListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link langParser#source_code}.
	 * @param ctx the parse tree
	 */
	void enterSource_code(langParser.Source_codeContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#source_code}.
	 * @param ctx the parse tree
	 */
	void exitSource_code(langParser.Source_codeContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(langParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(langParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(langParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(langParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(langParser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(langParser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(langParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(langParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#var_name}.
	 * @param ctx the parse tree
	 */
	void enterVar_name(langParser.Var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#var_name}.
	 * @param ctx the parse tree
	 */
	void exitVar_name(langParser.Var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link langParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(langParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link langParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(langParser.LiteralContext ctx);
}