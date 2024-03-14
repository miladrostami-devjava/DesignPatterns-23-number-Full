package org.example;

import org.example.dp.AndExpression;
import org.example.dp.Expression;
import org.example.dp.ORExpression;
import org.example.dp.TerminalExpression;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Expression getMaleExpression(){
        Expression amir = new TerminalExpression("amir");
        Expression ali = new TerminalExpression("ali");
        return  new ORExpression(ali,amir);


    }
public static Expression getMarriedWomanExpression(){
    Expression zahra = new TerminalExpression("zahra");
    Expression married = new TerminalExpression("married");
    return new AndExpression(zahra,married);
}


    public static void main( String[] args )
    {
Expression isMale = getMaleExpression();
Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("ali is male?" + isMale.interpret("ali"));
        System.out.println("amir is male?" + isMale.interpret("zahra"));
        System.out.println("zahra is married?" + isMarriedWoman.interpret("zahra married"));
        System.out.println("fatima is male?" + isMarriedWoman.interpret("fatima married"));

    }
}
