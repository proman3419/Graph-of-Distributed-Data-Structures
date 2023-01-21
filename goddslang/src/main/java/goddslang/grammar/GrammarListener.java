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
	 * Enter a parse tree produced by {@link GrammarParser#extendedLabel}.
	 * @param ctx the parse tree
	 */
	void enterExtendedLabel(GrammarParser.ExtendedLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#extendedLabel}.
	 * @param ctx the parse tree
	 */
	void exitExtendedLabel(GrammarParser.ExtendedLabelContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#functionAdd}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAdd(GrammarParser.FunctionAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionAdd}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAdd(GrammarParser.FunctionAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionSub}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSub(GrammarParser.FunctionSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionSub}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSub(GrammarParser.FunctionSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionMul}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMul(GrammarParser.FunctionMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionMul}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMul(GrammarParser.FunctionMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDiv}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDiv(GrammarParser.FunctionDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDiv}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDiv(GrammarParser.FunctionDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionMod}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMod(GrammarParser.FunctionModContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionMod}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMod(GrammarParser.FunctionModContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionSet}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSet(GrammarParser.FunctionSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionSet}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSet(GrammarParser.FunctionSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionComp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionComp(GrammarParser.FunctionCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionComp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionComp(GrammarParser.FunctionCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionSwap}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSwap(GrammarParser.FunctionSwapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionSwap}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSwap(GrammarParser.FunctionSwapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCopy}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCopy(GrammarParser.FunctionCopyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCopy}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCopy(GrammarParser.FunctionCopyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionDefineLabel}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefineLabel(GrammarParser.FunctionDefineLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionDefineLabel}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefineLabel(GrammarParser.FunctionDefineLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionJump}.
	 * @param ctx the parse tree
	 */
	void enterFunctionJump(GrammarParser.FunctionJumpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionJump}.
	 * @param ctx the parse tree
	 */
	void exitFunctionJump(GrammarParser.FunctionJumpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCheckIFEZ}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCheckIFEZ(GrammarParser.FunctionCheckIFEZContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCheckIFEZ}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCheckIFEZ(GrammarParser.FunctionCheckIFEZContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCheckIFLZ}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCheckIFLZ(GrammarParser.FunctionCheckIFLZContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCheckIFLZ}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCheckIFLZ(GrammarParser.FunctionCheckIFLZContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCheckIFGZ}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCheckIFGZ(GrammarParser.FunctionCheckIFGZContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCheckIFGZ}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCheckIFGZ(GrammarParser.FunctionCheckIFGZContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionExit}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExit(GrammarParser.FunctionExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionExit}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExit(GrammarParser.FunctionExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPrint}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrint(GrammarParser.FunctionPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPrint}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrint(GrammarParser.FunctionPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPrintNL}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrintNL(GrammarParser.FunctionPrintNLContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPrintNL}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrintNL(GrammarParser.FunctionPrintNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPrintChar}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrintChar(GrammarParser.FunctionPrintCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPrintChar}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrintChar(GrammarParser.FunctionPrintCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPrintNLChar}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrintNLChar(GrammarParser.FunctionPrintNLCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPrintNLChar}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrintNLChar(GrammarParser.FunctionPrintNLCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionWriteCell}.
	 * @param ctx the parse tree
	 */
	void enterFunctionWriteCell(GrammarParser.FunctionWriteCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionWriteCell}.
	 * @param ctx the parse tree
	 */
	void exitFunctionWriteCell(GrammarParser.FunctionWriteCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionReadCell}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReadCell(GrammarParser.FunctionReadCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionReadCell}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReadCell(GrammarParser.FunctionReadCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCopyCell}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCopyCell(GrammarParser.FunctionCopyCellContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCopyCell}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCopyCell(GrammarParser.FunctionCopyCellContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPrintLabelName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPrintLabelName(GrammarParser.FunctionPrintLabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPrintLabelName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPrintLabelName(GrammarParser.FunctionPrintLabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionPass}.
	 * @param ctx the parse tree
	 */
	void enterFunctionPass(GrammarParser.FunctionPassContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionPass}.
	 * @param ctx the parse tree
	 */
	void exitFunctionPass(GrammarParser.FunctionPassContext ctx);
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