package org.example;


public class App {
    public static void main(String[] args) {
        ConfigurationManagement config = ConfigurationManagement.getInstance();
        String dbHost = config.getProperty("db.host");
        String dbPort = config.getProperty("db.port");

        System.out.println("DB Connection =" + dbHost + ":" + dbPort);

    }
}
