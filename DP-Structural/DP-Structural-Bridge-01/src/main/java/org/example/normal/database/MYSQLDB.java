package org.example.normal.database;

import org.example.normal.interfaces.Database;

public class MYSQLDB implements Database {
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
