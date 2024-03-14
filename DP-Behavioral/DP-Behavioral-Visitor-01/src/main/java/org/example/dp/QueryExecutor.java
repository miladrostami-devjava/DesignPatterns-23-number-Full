package org.example.dp;

import org.example.dp.query.FromQuery;
import org.example.dp.query.SelectQuery;
import org.example.dp.query.WhereQuery;

public class QueryExecutor implements QueryPartVisitor{
private String query;
    @Override
    public void visit(SelectQuery selectQuery) {
query= "select *";
    }
    @Override
    public void visit(FromQuery fromQuery) {
query += "from users";
    }
    @Override
    public void visit(WhereQuery whereQuery) {
query += "where id = 10";
    }

    public String getQuery() {
        return query;
    }
    public void executeQuery(){
        System.out.println("Executing Query!");
        System.out.println(query);
        //logic to  executing the query
    }
}
