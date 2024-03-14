package org.example;

import java.time.LocalDate;

public class Log {
private String message;
private LocalDate date;
private LogLevel level;

    public Log() {
    }

    public Log(String message) {
        this.message = message;
    }

    public Log(String message, LocalDate date, LogLevel level) {
        this.message = message;
        this.date = date;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LogLevel getLevel() {
        return level;
    }

    public void setLevel(LogLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Log{" +
                "message='" + message + '\'' +
                ", date=" + date +
                ", level=" + level +
                '}';
    }
}
