package com.java.patterns.creational.factory;

public class InstitutionalPlan extends AbstractPlan {

    @Override
    public double getRate() {
        return 5.50;
    }

    @Override
    public double getManDate() {
        return 105.5;
    }

}