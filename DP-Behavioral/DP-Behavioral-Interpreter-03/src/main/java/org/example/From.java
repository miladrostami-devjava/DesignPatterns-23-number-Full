package org.example;

import java.util.List;

public class From implements Expression{
private final String table;

    public From(String table) {
        this.table = table;
    }

    @Override
    public List<String> interpreter(Context context) {
    context.setTable(table);
    return context.search();

    }
}
