package org.example.dp.query;

import org.example.dp.QueryPartVisitor;

public class SelectQuery implements QueryPart{
    private final String select;

    public SelectQuery(String select) {
        this.select = select;
    }

    @Override
    public void accept(QueryPartVisitor visitor) {
      visitor.visit(this);
    }

    public String getSelect() {
        return select;
    }
}
