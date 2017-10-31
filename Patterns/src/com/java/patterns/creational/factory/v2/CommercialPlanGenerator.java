package com.java.patterns.creational.factory.v2;

import com.java.patterns.creational.factory.CommercialPlan;
import com.java.patterns.creational.factory.IPlan;

public class CommercialPlanGenerator implements IPlanGenerator {

    @Override
    public IPlan generatePlan() {
        return new CommercialPlan();
    }

}
