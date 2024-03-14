package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
List<Memento> mementos = new ArrayList<>();
public void beginTransaction(Database database){
    mementos.add(database.save());

}
public void commitTransaction(){
mementos.clear();

}
    public void rollBackTransaction(Database database){
if (!mementos.isEmpty()){
    database.restore(mementos.get(mementos.size()-1));
    mementos.remove(mementos.size()-1);
}

    }

}
