package org.example.dp;

public class SubtractionExpression implements Expression{

    private final Expression left;
    private final Expression right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

}
