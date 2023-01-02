package goddslang.grammar;

public class GrammarCustomListener extends GrammarBaseListener {
    // End of code
    @Override
    public void exitStart(GrammarParser.StartContext ctx) {
        super.exitStart(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitPreamble(GrammarParser.PreambleContext ctx) {
        super.exitPreamble(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCellsCount(GrammarParser.CellsCountContext ctx) {
        super.exitCellsCount(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCellsGraph(GrammarParser.CellsGraphContext ctx) {
        super.exitCellsGraph(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitInputVals(GrammarParser.InputValsContext ctx) {
        super.exitInputVals(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCellCode(GrammarParser.CellCodeContext ctx) {
        super.exitCellCode(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCellCodePart(GrammarParser.CellCodePartContext ctx) {
        super.exitCellCodePart(ctx);
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);
        System.out.println(ctx.start.toString());
    }
}
