package com.java.patterns.behavioral.strategy;

public class ConcreteStrategyA implements IStrategy {

    @Override
    public void operation() {
        System.out.println("Strategy A!");
    }

}
