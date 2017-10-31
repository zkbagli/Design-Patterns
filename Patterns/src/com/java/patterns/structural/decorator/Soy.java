package com.java.patterns.structural.decorator;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + this.beverage.cost();
    }
}
