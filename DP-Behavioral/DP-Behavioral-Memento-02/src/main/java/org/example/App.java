package org.example;

import org.example.dp.Database;
import org.example.dp.TransactionManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database db = new Database();
        TransactionManager tm = new TransactionManager();
try {

    tm.beginTransaction(db);
    db.setData("data java");
    System.out.println("data in db is :" + db.getData());
    if (1==1){
        throw new RuntimeException("custom exception!!!");
    }

    tm.commitTransaction();
    System.out.println("data committed" + db.getData());
}catch (Exception e){
    tm.rollBackTransaction(db);
    System.out.println("data rolled back is:" + db.getData());
}
    }
}
