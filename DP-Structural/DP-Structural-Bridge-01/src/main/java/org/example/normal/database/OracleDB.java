package org.example.normal.database;

import org.example.normal.interfaces.Database;

public class OracleDB implements Database {

    @Override
    public void connect(String url, String username, String password) {
        System.out.println("connect to OracleDB");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("executeQuery in OracleDB" + query);
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect from OracleDB");
    }

}
