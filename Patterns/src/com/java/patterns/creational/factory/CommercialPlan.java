package com.java.patterns.creational.factory;

public class CommercialPlan extends AbstractPlan {

    @Override
    public double getRate() {
        return 7;
    }

    @Override
    public double getManDate() {
        return 254;
    }

    @Override
    public String toString() {
        return "CommercialPlan : rate : " + this.getRate() + " mandate : " + this.getManDate();
    }

}