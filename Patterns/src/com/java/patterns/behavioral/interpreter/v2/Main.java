package com.java.patterns.behavioral.interpreter.v2;

public class Main {

    static Expression buildInterpreterTree() {
        final Expression terminal1 = new TerminalExpression("John");
        final Expression terminal2 = new TerminalExpression("Henry");
        final Expression terminal3 = new TerminalExpression("Mary");
        final Expression terminal4 = new TerminalExpression("Owen");

        final Expression alternation1 = new OrExpression(terminal2,
                                                         terminal3);

        final Expression alternation2 = new OrExpression(terminal1,
                                                         alternation1);

        return new AndExpression(terminal4,
                                 alternation2);
    }

    public static void main(final String[] args) {

        final String context = "Mary Owen";

        final Expression define = Main.buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}