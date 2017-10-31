package com.java.patterns.creational.factory.v2;

import com.java.patterns.creational.factory.DomesticPlan;
import com.java.patterns.creational.factory.IPlan;

public class DomesticPlanGenerator implements IPlanGenerator {

    @Override
    public IPlan generatePlan() {
        return new DomesticPlan();
    }

}
