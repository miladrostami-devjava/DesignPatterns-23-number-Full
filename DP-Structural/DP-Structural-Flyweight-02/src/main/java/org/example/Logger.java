package org.example;

public class Logger {
    public void log(LogLevel level,String message){
        String color = LogFactory.getColor(level);
        System.out.println(color +"[" + level + "]" + message + ConsoleColor.RESET);

    }
}
