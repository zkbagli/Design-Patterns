package com.java.patterns.creational.factory;

public abstract class AbstractPlan implements IPlan {

    @Override
    public double calculateBill() {
        return this.getManDate() * this.getRate();
    }

}