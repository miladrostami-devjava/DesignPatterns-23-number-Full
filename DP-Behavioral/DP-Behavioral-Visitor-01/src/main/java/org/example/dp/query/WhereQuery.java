package org.example.dp.query;

import org.example.dp.QueryPartVisitor;

public class WhereQuery implements QueryPart{
    private final String where;

    public WhereQuery(String where) {
        this.where = where;
    }

    @Override
    public void accept(QueryPartVisitor visitor) {
      visitor.visit(this);
    }

    public String getWhere() {
        return where;
    }
}
