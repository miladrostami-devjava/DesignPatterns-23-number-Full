package org.example.logger;

import org.example.LogLevel;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger{


    protected FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
try (FileWriter writer = new FileWriter("log.txt",true)){
writer.write(message + "\n");
} catch (Exception e) {
    System.out.println(e.getMessage());;
}
    }


}
