package org.example.dp;

import org.example.dp.query.FromQuery;
import org.example.dp.query.SelectQuery;
import org.example.dp.query.WhereQuery;

public interface QueryPartVisitor {
    //SelectQuery => select *
    // FromQuery => from users
    // WhereQuery => where id = 10
    void visit(SelectQuery selectQuery);
    void visit(FromQuery fromQuery);
    void visit(WhereQuery whereQuery);


}
