package org.example;

import org.example.dp.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
// interpreter (5+2)-(4-1) = ?
        // x + y
        Context context = new Context();

        Expression expression =
                new SubtractionExpression(
                        new AdditionExpression(
                                new NumberExpression(5) ,new NumberExpression(2)),
                        new SubtractionExpression(new NumberExpression(4),
                                new NumberExpression(1))
                );
int result = expression.interpret(context);
        System.out.println("Result: " + result);


    }
}
