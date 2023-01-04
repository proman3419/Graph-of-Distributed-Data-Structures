package goddslang.grammar;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class GrammarCustomListener extends GrammarBaseListener {

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
    public void exitCellsCount(GrammarParser.CellsCountContext ctx) {
        super.exitCellsCount(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitCellsGraph(GrammarParser.CellsGraphContext ctx) {
        super.exitCellsGraph(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitInput(GrammarParser.InputContext ctx) {
        super.exitInput(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitCellHeader(GrammarParser.CellHeaderContext ctx) {
        super.exitCellHeader(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }

    @Override
    public void exitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);
        List<String> terminalNodes = getTerminalNodes(ctx);
        System.out.println(terminalNodes);
    }
}
