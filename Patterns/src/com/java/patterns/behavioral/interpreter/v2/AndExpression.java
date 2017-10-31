package com.java.patterns.behavioral.interpreter.v2;

public class AndExpression extends Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression(final Expression expression1,
                         final Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(final String str) {
        return this.expression1.interpret(str) && this.expression2.interpret(str);
    }
}