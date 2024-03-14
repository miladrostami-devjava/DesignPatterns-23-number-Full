package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
public List<String> query(String sqlQuery){

    List<String> result = new ArrayList<>();
    result.add("{\"id\":1,\"username\":\"milad71\",\"name\":\"milad\"}");
    result.add("{\"id\":2,\"username\":\"ali71\",\"name\":\"ali\"}");
    result.add("{\"id\":3,\"username\":\"hasan71\",\"name\":\"hasan\"}");
    result.add("{\"id\":4,\"username\":\"jack71\",\"name\":\"jack\"}");
    return result;
}



}
