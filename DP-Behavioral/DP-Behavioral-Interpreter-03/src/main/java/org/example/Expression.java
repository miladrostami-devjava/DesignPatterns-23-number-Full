package org.example;

import java.util.List;

public interface Expression {
    List<String> interpreter(Context context);
}
