package org.example.bridge.database;

import org.example.bridge.interfaces.Database;

public class OracleDB implements Database {
private final OracleDBConnector connector;

    public OracleDB(OracleDBConnector connector) {
        this.connector = connector;
    }

    @Override
    public void connect(String url, String username, String password) {
connector.connect(url,username,password);    }

    @Override
    public void executeQuery(String query) {
connector.executeQuery(query);    }

    @Override
    public void disconnect() {
connector.disconnect();    }

}
