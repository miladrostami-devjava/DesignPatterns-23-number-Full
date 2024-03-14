package org.example;

import org.example.dp.QueryExecutor;
import org.example.dp.query.FromQuery;
import org.example.dp.query.SelectQuery;
import org.example.dp.query.WhereQuery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//query: select * from users where id = 10
        //SelectQuery => select *
        // FromQuery => from users
        // WhereQuery => where id = 10

        QueryExecutor query = new QueryExecutor();
        SelectQuery selectQuery = new SelectQuery("select *");
        FromQuery fromQuery = new FromQuery("from users");
        WhereQuery whereQuery = new WhereQuery("where id = 900");

        selectQuery.accept(query);
        fromQuery.accept(query);
        whereQuery.accept(query);


        query.executeQuery();








    }
}
