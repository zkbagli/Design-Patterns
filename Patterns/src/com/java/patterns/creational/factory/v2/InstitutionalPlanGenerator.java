package com.java.patterns.creational.factory.v2;

import com.java.patterns.creational.factory.IPlan;
import com.java.patterns.creational.factory.InstitutionalPlan;

public class InstitutionalPlanGenerator implements IPlanGenerator {

    @Override
    public IPlan generatePlan() {
        return new InstitutionalPlan();
    }

}
