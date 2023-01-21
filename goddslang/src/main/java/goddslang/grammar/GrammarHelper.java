package goddslang.grammar;

import goddslang.core.function.Argument;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class GrammarHelper {
    public static List<String> getTerminalNodesHelper(ParseTree child, List<String> terminalNodes) {
        if (child instanceof TerminalNode) {
            terminalNodes.add(child.getText());
        } else {
            for (int i = 0; i < child.getChildCount(); i++) {
                terminalNodes = getTerminalNodesHelper(child.getChild(i), terminalNodes);
            }
        }
        return terminalNodes;
    }

    public static List<String> getTerminalNodes(ParserRuleContext ctx) {
        List<String> terminalNodes = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            terminalNodes = getTerminalNodesHelper(ctx.getChild(i), terminalNodes);
        }
        return terminalNodes;
    }

    public static List<Argument> parseArguments(List<String> terminalNodes, String types) {
        List<Argument> arguments = new ArrayList<>();
        for (int i = 1; i < terminalNodes.size(); i++) {
            Argument argument;
            if (types.charAt(i - 1) == '*') {
                try {
                    argument = new Argument(Integer.parseInt(terminalNodes.get(i)));
                } catch(NumberFormatException e){
                    argument = new Argument(terminalNodes.get(i));
                }
            } else if (types.charAt(i - 1) == 'i') {
                argument = new Argument(Integer.parseInt(terminalNodes.get(i)));
            } else {
                argument = new Argument(terminalNodes.get(i));
            }
            arguments.add(argument);
        }
        return arguments;
    }
}
