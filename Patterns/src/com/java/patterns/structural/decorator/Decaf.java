package com.java.patterns.structural.decorator;

public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}