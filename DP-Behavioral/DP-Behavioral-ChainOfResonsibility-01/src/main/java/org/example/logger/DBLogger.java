package org.example.logger;

import org.example.LogLevel;

public class DBLogger extends Logger{

    protected DBLogger(LogLevel logLevel) {
        super(logLevel);
    }




    @Override
    protected void writeMessage(String message) {
        System.out.println("Log message to database :" + message);
    }



}
