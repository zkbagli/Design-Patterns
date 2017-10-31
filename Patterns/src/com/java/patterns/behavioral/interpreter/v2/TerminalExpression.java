package com.java.patterns.behavioral.interpreter.v2;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(final String str) {
        this.literal = str;
    }

    @Override
    public boolean interpret(final String str) {
        final StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            final String test = st.nextToken();
            if (test.equals(this.literal)) {
                return true;
            }
        }
        return false;
    }

}