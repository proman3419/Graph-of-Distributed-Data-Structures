package goddslang.grammar;

public class GrammarCustomListener extends GrammarBaseListener {
    // End of code
//    @Override
//    public void exitStart(GrammarParser.StartContext ctx) {
//        super.exitStart(ctx);
//        System.out.println("A");
//        System.out.println(ctx.start.toString());
//    }

//    @Override
//    public void exitPreamble(GrammarParser.PreambleContext ctx) {
//        super.exitPreamble(ctx);
//        System.out.println("B");
//        System.out.println(ctx.start.toString());
//    }

    @Override
    public void exitCellsCount(GrammarParser.CellsCountContext ctx) {
        super.exitCellsCount(ctx);
        System.out.println("C");
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCellsGraph(GrammarParser.CellsGraphContext ctx) {
        super.exitCellsGraph(ctx);
        System.out.println("D");
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitInputVals(GrammarParser.InputValsContext ctx) {
        super.exitInputVals(ctx);
        System.out.println("E");
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitCell(GrammarParser.CellContext ctx) {
        super.exitCell(ctx);
        System.out.println("F");
        System.out.println(ctx.start.toString());
    }

    @Override
    public void exitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        super.exitFunctionCall(ctx);
        System.out.println("G");
        System.out.println(ctx.start.toString());
    }
}
