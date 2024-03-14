package org.example;

import org.example.dp.DataBase;
import org.example.dp.DatabaseClient;
import org.example.dp.QueryIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DataBase dataBase = new DataBase();
        DatabaseClient client = new DatabaseClient(dataBase);
        String sqlQuery = "select from * database";
        QueryIterator iterator = client.executeQuery(sqlQuery);
        while (iterator.hasNext()){
            String sql = iterator.next();
            System.out.println(sql);
            //other process

        }



    }
}
