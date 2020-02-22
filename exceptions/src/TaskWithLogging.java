import java.util.logging.ConsoleHandler;
import java.util.logging.XMLFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskWithLogging {

    public static void configureLogging() {
        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);

        XMLFormatter xmlFormatter = new XMLFormatter();

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(xmlFormatter);

        Logger logger = Logger.getLogger("org.stepic.java");
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
    }

    public static void main(String[] args) {
        configureLogging();
    }
}
