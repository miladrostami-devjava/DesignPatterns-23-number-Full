package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Logger {
private static Logger instance = new Logger();
private List<Log> logs;
    private Logger() {
     logs = new ArrayList<>();

    }
    public static Logger getInstance(){

        return instance;
    }
    public  List<Log> getAllLogs(){
        return logs;
    }
public void log(LogLevel level,String message){
        logs.add(new Log(
                message,
                LocalDate.now(),
                LogLevel.INFO
        ));

}
}
