package org.example.dp;

public class ORExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public ORExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String context) {
        return left.interpret(context) || right.interpret(context);
    }

}
