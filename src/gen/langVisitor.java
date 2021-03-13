package gen;// Generated from C:/Users/Admin/source/repos/lang/src\lang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link langParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface langVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link langParser#source_code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_code(langParser.Source_codeContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(langParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(langParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(langParser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(langParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_name(langParser.Var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link langParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(langParser.LiteralContext ctx);
}