package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {
    private static Map<String, List<Row>> tables = new HashMap<>();

    static {
        List<Row> people = new ArrayList<>();
        people.add(new Row("milad", "rostami"));
        people.add(new Row("sadegh", "zarei"));
        people.add(new Row("saman", "zarei"));
        tables.put("people", people);


    }
    private Function<String, Stream<? extends String>> columnMapper = Stream::of;
    private String table;
    private String column;
private Integer colIndex = -1;

    public void setTable(String table) {
        this.table = table;
    }

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    private void setColumnMapper() {
switch (column){
    case "*" :
        colIndex = -1;
        break;
    case "firstname" :
        colIndex =0;
        break;
    case "lastname":
        colIndex=1;
        break;
}
if (colIndex !=-1){
    columnMapper = s-> Stream.of(s.split(" ")[colIndex]);
}
    }

    public List<String> search(){
        List<String> result = tables.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(table))
                .flatMap(x-> Stream.of(x.getValue()))
                .flatMap(Collection::stream)
                .map(Row::toString)
                .flatMap(columnMapper)
                .collect(Collectors.toList());
        return result;
    }


    public void setContext(String column) {

    }
}
