package goddslang;

import goddslang.grammar.GrammarCustomListener;
import goddslang.grammar.GrammarLexer;
import goddslang.grammar.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        try {
////            String filePath = Objects.requireNonNull(Main.class.getClassLoader().getResource("code snippets/example01.godds")).getPath();
//            URI fileUri = ClassLoader.getSystemResource("code snippets/example01.godds").toURI();
//            String filePath = Paths.get(fileUri).toString();
//            CharStream charStream = CharStreams.fromFileName(filePath);
//            GrammarLexer lexer = new GrammarLexer(charStream);
//            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
//            GrammarParser parser = new GrammarParser(commonTokenStream);
//
//            ParseTree parseTree = parser.start();
//            System.out.println(">>>>>>>>>>>>>> FINISHED");
//            System.out.println(parseTree.toStringTree());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
//        }
        try {
            URI fileUri = ClassLoader.getSystemResource("code snippets/example10_modyfing_order_of_calls_multiple_cells.godds").toURI();
            String filePath = Paths.get(fileUri).toString();
            CharStream input = (CharStream) new ANTLRFileStream(filePath);
            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            parser.addParseListener(new GrammarCustomListener());
            parser.start();
        } catch (IOException ex) {
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}