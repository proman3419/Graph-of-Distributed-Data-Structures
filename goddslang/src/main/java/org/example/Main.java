package org.example;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        ANTLRStringStream in = new ANTLRStringStream("12*(5-6)");
        ExpLexer lexer = new ExpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExpParser parser = new ExpParser(tokens);
        parser.eval();
    }
}