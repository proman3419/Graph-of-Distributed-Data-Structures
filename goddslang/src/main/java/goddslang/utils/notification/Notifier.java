package goddslang.utils.notification;

import goddslang.core.model.Program;

public class Notifier {
    private static final String ANSI_RESET = "\u001B[0m";

    public static void notifyParse(ParseNotification parseNotification) {
        System.out.printf("%s[ expression: %s | %s ]%s\n",
                parseNotification.getNotificationType().color, parseNotification.getExpression(),
                parseNotification.getDescription(), ANSI_RESET);
        if (parseNotification.getNotificationType() == NotificationType.PARSE_ERROR) {
            Program.setTerminate(true);
        }
    }

    public static void notifyRuntime(RuntimeNotification runtimeNotification) {
        System.out.printf("%s[ executor label: %s | function call owner: %s | function call id: %d | %s ]%s\n",
                runtimeNotification.getNotificationType().color, runtimeNotification.getCell().getLabel(),
                runtimeNotification.getFunctionCall().getOwner().getLabel(),
                runtimeNotification.getFunctionCall().getId(), runtimeNotification.getDescription(), ANSI_RESET);
        if (runtimeNotification.getNotificationType() == NotificationType.RUNTIME_ERROR) {
            Program.setTerminate(true);
        }
    }
}
