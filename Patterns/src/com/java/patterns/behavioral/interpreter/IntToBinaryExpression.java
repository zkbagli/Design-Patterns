package com.java.patterns.behavioral.interpreter;

public class IntToBinaryExpression implements Expression {

    private final int i;

    public IntToBinaryExpression(final int c) {
        this.i = c;
    }

    @Override
    public String interpret(final InterpreterContext ic) {
        return ic.getBinaryFormat(this.i);
    }

}