interface Loggerr {

    void logMessage(String message);

    default void logInfo(String message) {
        System.out.println("INFO: " + message);
    }

    static void logError(String message) {
        System.out.println("ERROR: " + message);
    }
}

class FileLogger implements Loggerr {

    public void logMessage(String message) {
        System.out.println("File Log: " + message);
    }
}

public class Logger {
    public static void main(String[] args) {

        FileLogger loggerr = new FileLogger();

        loggerr.logMessage("Application started.");

        loggerr.logInfo("User logged in.");

        Loggerr.logError("File not found.");
    }
}