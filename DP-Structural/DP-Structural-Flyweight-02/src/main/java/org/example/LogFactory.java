package org.example;

import java.util.HashMap;
import java.util.Map;

public class LogFactory {
    private static final Map<LogLevel,String> colorMap = new HashMap<>();
static {
    colorMap.put(LogLevel.WARNING,ConsoleColor.YELLOW);
    colorMap.put(LogLevel.DEBUG,ConsoleColor.WHITE);
    colorMap.put(LogLevel.INFO,ConsoleColor.GREEN);
    colorMap.put(LogLevel.ERROR,ConsoleColor.RED);
}
public static String getColor(LogLevel level){
    return colorMap.get(level);
}





}
