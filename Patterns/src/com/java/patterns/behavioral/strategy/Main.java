package com.java.patterns.behavioral.strategy;

public class Main {

    public static void main(final String[] args) {
        final Context contextA = new Context(new ConcreteStrategyA());
        final Context contextB = new Context(new ConcreteStrategyB());
        contextA.doIt();
        contextB.doIt();
    }
}
