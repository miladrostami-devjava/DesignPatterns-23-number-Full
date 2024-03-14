package org.example.dp;

import java.util.List;

public class DatabaseClient {
    private final DataBase db;

    public DatabaseClient(DataBase db) {
        this.db = db;
    }
    public QueryIterator executeQuery(String sqlQuery){
        List<String> result = db.query(sqlQuery);
        return  new DataBaseQueryIterator(result);
    }

}
