// Generated from java-escape by ANTLR 4.11.1
package goddslang.grammar;
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
	 * Enter a parse tree produced by {@link GrammarParser#cellsCount}.
	 * @param ctx the parse tree
	 */
	void enterCellsCount(GrammarParser.CellsCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellsCount}.
	 * @param ctx the parse tree
	 */
	void exitCellsCount(GrammarParser.CellsCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cellsGraph}.
	 * @param ctx the parse tree
	 */
	void enterCellsGraph(GrammarParser.CellsGraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellsGraph}.
	 * @param ctx the parse tree
	 */
	void exitCellsGraph(GrammarParser.CellsGraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inputVals}.
	 * @param ctx the parse tree
	 */
	void enterInputVals(GrammarParser.InputValsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inputVals}.
	 * @param ctx the parse tree
	 */
	void exitInputVals(GrammarParser.InputValsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inputCells}.
	 * @param ctx the parse tree
	 */
	void enterInputCells(GrammarParser.InputCellsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inputCells}.
	 * @param ctx the parse tree
	 */
	void exitInputCells(GrammarParser.InputCellsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cells}.
	 * @param ctx the parse tree
	 */
	void enterCells(GrammarParser.CellsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cells}.
	 * @param ctx the parse tree
	 */
	void exitCells(GrammarParser.CellsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cell}.
	 * @param ctx the parse tree
	 */
	void enterCell(GrammarParser.CellContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cell}.
	 * @param ctx the parse tree
	 */
	void exitCell(GrammarParser.CellContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cellHeader}.
	 * @param ctx the parse tree
	 */
	void enterCellHeader(GrammarParser.CellHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellHeader}.
	 * @param ctx the parse tree
	 */
	void exitCellHeader(GrammarParser.CellHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cellCode}.
	 * @param ctx the parse tree
	 */
	void enterCellCode(GrammarParser.CellCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cellCode}.
	 * @param ctx the parse tree
	 */
	void exitCellCode(GrammarParser.CellCodeContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
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