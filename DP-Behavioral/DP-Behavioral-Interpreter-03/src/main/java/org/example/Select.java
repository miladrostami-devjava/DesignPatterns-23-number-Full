package org.example;

import java.util.List;

public class Select implements Expression {
    private final String column;
    private final From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }


    @Override
    public List<String> interpreter(Context context) {
         context.setContext(column);
        return from.interpreter(context);
    }
}
