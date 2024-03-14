package org.example.bridge.database;

import org.example.bridge.interfaces.DatabaseConnector;

public class MYSQLDBConnector implements DatabaseConnector {

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("connect to mysql");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("executeQuery in mysql" + query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect from mysql");
    }

}
