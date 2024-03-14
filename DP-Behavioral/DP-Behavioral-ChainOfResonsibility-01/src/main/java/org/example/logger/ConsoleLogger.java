package org.example.logger;

import org.example.LogLevel;

public class ConsoleLogger extends Logger{
    protected ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println(message);
    }
}
