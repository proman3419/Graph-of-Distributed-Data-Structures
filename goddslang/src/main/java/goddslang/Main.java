package goddslang;

import goddslang.grammar.GrammarCustomListener;
import goddslang.grammar.GrammarLexer;
import goddslang.grammar.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CharStream input = null;
        try {
            input = (CharStream) new ANTLRFileStream(args[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        GrammarLexer lexer = new GrammarLexer(input);
        GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
        parser.addParseListener(new GrammarCustomListener());
        parser.start();
    }
}