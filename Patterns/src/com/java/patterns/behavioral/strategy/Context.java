package com.java.patterns.behavioral.strategy;

public class Context {
    IStrategy strategy;

    public Context(final IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doIt() {
        this.strategy.operation();
    }
}
