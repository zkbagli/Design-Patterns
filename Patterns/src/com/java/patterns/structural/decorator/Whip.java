package com.java.patterns.structural.decorator;

public class Whip extends CondimentDecorator {
    private final Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
}
