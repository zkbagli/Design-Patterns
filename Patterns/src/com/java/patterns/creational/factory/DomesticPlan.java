package com.java.patterns.creational.factory;

public class DomesticPlan extends AbstractPlan {
    @Override
    public double getRate() {
        return 3;
    }

    @Override
    public double getManDate() {
        return 153;
    }

}