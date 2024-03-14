package org.example.normal.interfaces;

public interface Database {
    void connect(String url,String username,String password);
    void executeQuery(String query);
    void disconnect();

}
