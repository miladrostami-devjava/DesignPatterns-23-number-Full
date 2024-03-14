package org.example;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//sql query: select firstname from people

        Expression query1 = new Select("firstname", new From("people"));
        Context context1 = new Context();
        List<String> result = query1.interpreter(context1);
        System.out.println(result);

    }
}
