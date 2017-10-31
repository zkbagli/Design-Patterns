package com.java.patterns.creational.factory.v2;

import com.java.patterns.creational.factory.IPlan;

public class PlanFactory {
    public static IPlan getPlan(final EPlanTypes planTypes) {
        return planTypes.getPlanGenerator().generatePlan();
    }
}
