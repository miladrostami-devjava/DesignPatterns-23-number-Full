package org.example.dp.query;

import org.example.dp.QueryPartVisitor;

public interface QueryPart {
    void accept(QueryPartVisitor visitor);

}
