package goddslang.grammar;

import goddslang.utils.notification.ParseNotification;
import goddslang.utils.notification.Notifier;
import goddslang.utils.notification.NotificationType;
import goddslang.core.function.Argument;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            Argument argument = null;
            String terminalNode = terminalNodes.get(i);
            char type = types.charAt(i - 1);
            if (type == '*') {
                argument = isNumeric(terminalNode) ? parseNumber(terminalNode, terminalNodes) : parseId(terminalNode);
            } else if (type == 'i') {
                argument = parseNumber(terminalNode, terminalNodes);
            } else if (type == 's') {
                argument = parseId(terminalNode);
            }
            arguments.add(argument);
        }
        return arguments;
    }

    public static String collectExpression(List<String> terminalNodes) {
        return terminalNodes.stream().collect(Collectors.joining(" "));
    }

    private static Argument parseNumber(String terminalNode, List<String> terminalNodes) {
        Argument argument = null;
        try {
            argument = new Argument(Integer.parseInt(terminalNode));
        } catch (NumberFormatException e) {
            String expression = collectExpression(terminalNodes);
            Notifier.notifyParse(new ParseNotification(NotificationType.PARSE_ERROR, expression, "Format of the number is invalid"));
        }
        return argument;
    }

    private static Argument parseId(String terminalNode) {
        return new Argument(terminalNode);
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  // match a number with optional '-' and decimal.
    }
}
