package org.example;

public class DataBaseContext {
    //Eager
  //  private static final DataBaseContext instance = new DataBaseContext();
// Lazy
private static  DataBaseContext instance;
private DBConnection connection;

    private DataBaseContext() {
        connection = new DBConnection();
    }
    public DBConnection getConnection(){
        return connection;

    }
    public static DataBaseContext getInstance(){
        if (instance == null){
            instance = new DataBaseContext();
        }
        return instance;
    }
}
