package org.example.dp.query;

import org.example.dp.QueryPartVisitor;

public class FromQuery implements QueryPart{
    private final String from;

    public FromQuery(String from) {
        this.from = from;
    }

    @Override
    public void accept(QueryPartVisitor visitor) {
      visitor.visit(this);
    }

    public String getFrom() {
        return from;
    }
}
