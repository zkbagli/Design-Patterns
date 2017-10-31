package com.java.patterns.creational.factory.v2;

import com.java.patterns.creational.factory.IPlan;

public class GenerateBill {
    public static void main(final String[] args) {

        final IPlan domasticPlan = PlanFactory.getPlan(EPlanTypes.DOMESTIC);
        System.out.print("Bill amount for " + "DOMESTICPLAN" + " of  " + domasticPlan.getManDate() + " m/d is: " + domasticPlan.calculateBill());

        final IPlan commercialPlan = PlanFactory.getPlan(EPlanTypes.COMMERTIAL);
        System.out.print("Bill amount for " + "COMMERCIALPLAN" + " of  " + commercialPlan.getManDate() + " m/d is: " + commercialPlan.calculateBill());

    }
}
