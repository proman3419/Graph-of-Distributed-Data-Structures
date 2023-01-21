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
	 * Visit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAdd(GrammarParser.FunctionAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSub(GrammarParser.FunctionSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMul(GrammarParser.FunctionMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDiv(GrammarParser.FunctionDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMod(GrammarParser.FunctionModContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSet(GrammarParser.FunctionSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionComp(GrammarParser.FunctionCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionSwap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSwap(GrammarParser.FunctionSwapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCopy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCopy(GrammarParser.FunctionCopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDefineLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefineLabel(GrammarParser.FunctionDefineLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionJump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionJump(GrammarParser.FunctionJumpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCheckIFEZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCheckIFEZ(GrammarParser.FunctionCheckIFEZContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCheckIFLZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCheckIFLZ(GrammarParser.FunctionCheckIFLZContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCheckIFGZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCheckIFGZ(GrammarParser.FunctionCheckIFGZContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionExit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExit(GrammarParser.FunctionExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrint(GrammarParser.FunctionPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPrintNL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrintNL(GrammarParser.FunctionPrintNLContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPrintChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrintChar(GrammarParser.FunctionPrintCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPrintNLChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrintNLChar(GrammarParser.FunctionPrintNLCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionWriteCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionWriteCell(GrammarParser.FunctionWriteCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionReadCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReadCell(GrammarParser.FunctionReadCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCopyCell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCopyCell(GrammarParser.FunctionCopyCellContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPrintLabelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPrintLabelName(GrammarParser.FunctionPrintLabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionPass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionPass(GrammarParser.FunctionPassContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link GrammarParser#extendedDefinedLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendedDefinedLabel(GrammarParser.ExtendedDefinedLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#definedLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedLabel(GrammarParser.DefinedLabelContext ctx);
}