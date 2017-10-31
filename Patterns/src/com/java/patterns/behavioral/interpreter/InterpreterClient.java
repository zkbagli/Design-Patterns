package com.java.patterns.behavioral.interpreter;

public class InterpreterClient {

    public InterpreterContext ic;

    public InterpreterClient(final InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(final String str) {
        Expression exp = null;
        // create rules for expressions
        if (str.contains("Hexadecimal")) {
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0,
                                                                        str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,
                                                                           str.indexOf(" "))));
        } else {
            return str;
        }

        return exp.interpret(this.ic);
    }

    public static void main(final String args[]) {
        final String str1 = "28 in Binary";
        final String str2 = "28 in Hexadecimal";

        final InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));

    }
}