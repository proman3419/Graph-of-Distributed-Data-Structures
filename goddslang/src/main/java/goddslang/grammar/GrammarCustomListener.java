package goddslang.grammar;

import goddslang.core.function.Argument;
import goddslang.core.function.FunctionCall;
import goddslang.core.function.impl.*;
import goddslang.core.model.Program;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class GrammarCustomListener extends GrammarBaseListener {
    private Program program = null;

    private List<String> getTerminalNodesHelper(ParseTree child, List<String> terminalNodes) {
        if (child instanceof TerminalNode) {
            terminalNodes.add(child.getText());
        } else {
            for (int i = 0; i < child.getChildCount(); i++) {
                terminalNodes = getTerminalNodesHelper(child.getChild(i), terminalNodes);
            }
        }
        return terminalNodes;
    }

    private List<String> getTerminalNodes(ParserRuleContext ctx) {
        List<String> terminalNodes = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            terminalNodes = getTerminalNodesHelper(ctx.getChild(i), terminalNodes);
        }
        return terminalNodes;
    }

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
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);

        int cellsCount = Integer.parseInt(terminalNodes.get(1));
        program.init(cellsCount);
    }

    @Override
    public void exitCellsGraph(GrammarParser.CellsGraphContext ctx) {
        super.exitCellsGraph(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);

        List<String> graphAdjMatrixRaw = terminalNodes.subList(1, terminalNodes.size() - 1);

        this.program.getGraph().parseAdjMatrix(graphAdjMatrixRaw);
    }

    @Override
    public void exitInputVals(GrammarParser.InputValsContext ctx) {
        super.exitInputVals(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitInputCells(GrammarParser.InputCellsContext ctx) {
        super.exitInputCells(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitCellHeader(GrammarParser.CellHeaderContext ctx) {
        super.exitCellHeader(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);

        int id = Integer.parseInt(terminalNodes.get(1));
        String label = terminalNodes.get(2);

        this.program.createCell(id, label);
    }

    // v Functions v  ==================================================================================================
    private List<Argument> parseArguments(List<String> terminalNodes, String types) {
        List<Argument> arguments = new ArrayList<>();
        for (int i = 1; i < terminalNodes.size(); i++) {
            Argument argument;
            if (types.charAt(i - 1) == 'i') {
                argument = new Argument(Integer.parseInt(terminalNodes.get(i)));
            } else {
                argument = new Argument(terminalNodes.get(i));
            }
            arguments.add(argument);
        }
        return arguments;
    }

    @Override
    public void exitFunctionAdd(GrammarParser.FunctionAddContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Add(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSub(GrammarParser.FunctionSubContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Sub(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionMul(GrammarParser.FunctionMulContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Mul(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionDiv(GrammarParser.FunctionDivContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Div(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionMod(GrammarParser.FunctionModContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Mod(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSet(GrammarParser.FunctionSetContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Set(), parseArguments(getTerminalNodes(ctx), "ii"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionComp(GrammarParser.FunctionCompContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Comp(), parseArguments(getTerminalNodes(ctx), "i"));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionSwap(GrammarParser.FunctionSwapContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Swap(), parseArguments(getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }

    @Override
    public void exitFunctionCopy(GrammarParser.FunctionCopyContext ctx) {
        FunctionCall functionCall = new FunctionCall(new Copy(), parseArguments(getTerminalNodes(ctx), ""));
        this.program.getGraph().addCellFunctionCall(functionCall);
    }
}
