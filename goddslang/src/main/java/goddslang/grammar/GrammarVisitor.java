// Generated from java-escape by ANTLR 4.11.1
package goddslang.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#preamble}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreamble(GrammarParser.PreambleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cellsCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellsCount(GrammarParser.CellsCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cellsGraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellsGraph(GrammarParser.CellsGraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(GrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inputVals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVals(GrammarParser.InputValsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#inputCells}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputCells(GrammarParser.InputCellsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cells}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCells(GrammarParser.CellsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell(GrammarParser.CellContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cellHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellHeader(GrammarParser.CellHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cellCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellCode(GrammarParser.CellCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#cellCodePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellCodePart(GrammarParser.CellCodePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionSuper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSuper(GrammarParser.FunctionSuperContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#idArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArgument(GrammarParser.IdArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numberArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberArgument(GrammarParser.NumberArgumentContext ctx);
}