package goddslang.grammar;

import goddslang.core.function.FunctionCall;
import goddslang.core.function.impl.*;
import goddslang.core.model.Program;

import java.util.List;

public class GrammarCustomListener extends GrammarBaseListener {
    private Program program = null;

    @Override
    public void enterStart(GrammarParser.StartContext ctx) {
        this.program = new Program();
    }

    @Override
    public void exitStart(GrammarParser.StartContext ctx) {
        this.program.getGraph().completeSetup();
        this.program.run();
        this.program = null;
    }

    @Override
    public void exitCellsCount(GrammarParser.CellsCountContext ctx) {
        super.exitCellsCount(ctx);
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        int cellsCount = Integer.parseInt(terminalNodes.get(1));
        program.init(cellsCount);
    }

    @Override
    public void exitCellsGraph(GrammarParser.CellsGraphContext ctx) {
        super.exitCellsGraph(ctx);
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        List<String> graphAdjMatrixRaw = terminalNodes.subList(1, terminalNodes.size() - 1);
        this.program.getGraph().parseAdjMatrix(graphAdjMatrixRaw);
    }

    @Override
    public void exitInputVals(GrammarParser.InputValsContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "i".repeat(terminalNodes.size() - 1);
        this.program.getGraph().setBusVals(GrammarHelper.parseArguments(terminalNodes, types));
    }

    @Override
    public void exitInputCells(GrammarParser.InputCellsContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "i".repeat(terminalNodes.size() - 1);
        this.program.getGraph().setupBus(GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), types));
    }

    @Override
    public void exitCellHeader(GrammarParser.CellHeaderContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        int id = Integer.parseInt(terminalNodes.get(1));
        String label = terminalNodes.get(2);
        this.program.createCell(id, label);
    }

    // v Functions v  ==================================================================================================
    @Override
    public void exitFunctionAdd(GrammarParser.FunctionAddContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Add(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSub(GrammarParser.FunctionSubContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Sub(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionMul(GrammarParser.FunctionMulContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Mul(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionDiv(GrammarParser.FunctionDivContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Div(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionMod(GrammarParser.FunctionModContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Mod(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSet(GrammarParser.FunctionSetContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Set(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "si"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionComp(GrammarParser.FunctionCompContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Comp(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "*"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSwap(GrammarParser.FunctionSwapContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Swap(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCopy(GrammarParser.FunctionCopyContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Copy(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCopyCell(GrammarParser.FunctionCopyCellContext ctx) {
        FunctionCall functionCall = new FunctionCall(new CopyCell(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }


    @Override
    public void exitFunctionPrint(GrammarParser.FunctionPrintContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "s".repeat(terminalNodes.size() - 2) + "i";
        FunctionCall functionCall = new FunctionCall(new Print(), GrammarHelper.parseArguments(terminalNodes, types));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionPrintNL(GrammarParser.FunctionPrintNLContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "s".repeat(terminalNodes.size() - 2) + "i";
        FunctionCall functionCall = new FunctionCall(new PrintNL(), GrammarHelper.parseArguments(terminalNodes, types));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionPrintChar(GrammarParser.FunctionPrintCharContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "s".repeat(terminalNodes.size() - 2) + "i";
        FunctionCall functionCall = new FunctionCall(new PrintChar(), GrammarHelper.parseArguments(terminalNodes, types));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionPrintNLChar(GrammarParser.FunctionPrintNLCharContext ctx) {
        List<String> terminalNodes = GrammarHelper.getTerminalNodes(ctx);
        String types = "s".repeat(terminalNodes.size() - 2) + "i";
        FunctionCall functionCall = new FunctionCall(new PrintNLChar(), GrammarHelper.parseArguments(terminalNodes, types));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionPrintLabelName(GrammarParser.FunctionPrintLabelNameContext ctx) {
        FunctionCall functionCall = new FunctionCall(new PrintLabelName(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionReadCell(GrammarParser.FunctionReadCellContext ctx) {
        FunctionCall functionCall = new FunctionCall(new ReadCell(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionWriteCell(GrammarParser.FunctionWriteCellContext ctx) {
        FunctionCall functionCall = new FunctionCall(new WriteCell(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionReadBus(GrammarParser.FunctionReadBusContext ctx) {
        FunctionCall functionCall = new FunctionCall(new ReadBus(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionPass(GrammarParser.FunctionPassContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Pass(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionDefineLabel(GrammarParser.FunctionDefineLabelContext ctx) {
        FunctionCall functionCall = new FunctionCall(new DefineLabel(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionJump(GrammarParser.FunctionJumpContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Jump(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "ssss")); // at most 4
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCheckIFEZ(GrammarParser.FunctionCheckIFEZContext ctx) {
        FunctionCall functionCall = new FunctionCall(new IFEZ(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "ssss")); // at most 4
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCheckIFLZ(GrammarParser.FunctionCheckIFLZContext ctx) {
        FunctionCall functionCall = new FunctionCall(new IFLZ(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "ssss")); // at most 4
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCheckIFGZ(GrammarParser.FunctionCheckIFGZContext ctx) {
        FunctionCall functionCall = new FunctionCall(new IFGZ(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "ssss")); // at most 4
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionExit(GrammarParser.FunctionExitContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Exit(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionTerminate(GrammarParser.FunctionTerminateContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Terminate(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionAbs(GrammarParser.FunctionAbsContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Abs(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCheckIFNZ(GrammarParser.FunctionCheckIFNZContext ctx) {
        FunctionCall functionCall = new FunctionCall(new IFNZ(), GrammarHelper.parseArguments(GrammarHelper.getTerminalNodes(ctx), "s"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }
}
