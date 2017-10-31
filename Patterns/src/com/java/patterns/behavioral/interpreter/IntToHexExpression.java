package com.java.patterns.behavioral.interpreter;

public class IntToHexExpression implements Expression {

    private final int i;

    public IntToHexExpression(final int c) {
        this.i = c;
    }

    @Override
    public String interpret(final InterpreterContext ic) {
        return ic.getHexadecimalFormat(this.i);
    }

}