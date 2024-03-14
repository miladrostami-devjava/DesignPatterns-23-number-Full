package org.example.logger;

import org.example.LogLevel;

public abstract class Logger {
    protected final LogLevel logLevel;
    protected Logger nextLogger;

    protected Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
public void log(LogLevel level,String message){
        if (this.logLevel.ordinal() <= level.ordinal()){
            writeMessage(message);
        }
        if (nextLogger != null){
            nextLogger.log(level, message);
        }

}

    protected abstract void writeMessage(String message);
public static Logger getLogger(){
    Logger errorLogger = new DBLogger(LogLevel.ERROR);
    Logger warningLogger = new FileLogger(LogLevel.WARNING);
    Logger infoLogger = new ConsoleLogger(LogLevel.INFO);

    errorLogger.setNextLogger(warningLogger);
    warningLogger.setNextLogger(infoLogger);

    return errorLogger;



}


}
