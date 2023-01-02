// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#preamble}.
	 * @param ctx the parse tree
	 */
	void enterPreamble(GrammarParser.PreambleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#preamble}.
	 * @param ctx the parse tree
	 */
	void exitPreamble(GrammarParser.PreambleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cellsCode}.
	 * @param ctx the parse tree
	 */
	void enterCellsCode(GrammarParser.CellsCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellsCode}.
	 * @param ctx the parse tree
	 */
	void exitCellsCode(GrammarParser.CellsCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cellCodePart}.
	 * @param ctx the parse tree
	 */
	void enterCellCodePart(GrammarParser.CellCodePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellCodePart}.
	 * @param ctx the parse tree
	 */
	void exitCellCodePart(GrammarParser.CellCodePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionSuper}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSuper(GrammarParser.FunctionSuperContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionSuper}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSuper(GrammarParser.FunctionSuperContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionNoArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNoArgument(GrammarParser.FunctionNoArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionNoArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNoArgument(GrammarParser.FunctionNoArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionIDArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIDArgument(GrammarParser.FunctionIDArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionIDArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIDArgument(GrammarParser.FunctionIDArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionNUMBERArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNUMBERArgument(GrammarParser.FunctionNUMBERArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionNUMBERArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNUMBERArgument(GrammarParser.FunctionNUMBERArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#idArgument}.
	 * @param ctx the parse tree
	 */
	void enterIdArgument(GrammarParser.IdArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#idArgument}.
	 * @param ctx the parse tree
	 */
	void exitIdArgument(GrammarParser.IdArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numberArgument}.
	 * @param ctx the parse tree
	 */
	void enterNumberArgument(GrammarParser.NumberArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numberArgument}.
	 * @param ctx the parse tree
	 */
	void exitNumberArgument(GrammarParser.NumberArgumentContext ctx);
}