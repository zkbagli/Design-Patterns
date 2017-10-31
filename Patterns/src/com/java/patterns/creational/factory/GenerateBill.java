package com.java.patterns.creational.factory;

import java.io.IOException;

public class GenerateBill {

    public static void main(final String args[]) throws IOException {

        final GetPlanFactory planFactory = new GetPlanFactory();

        final IPlan domasticPlan = planFactory.getPlan("DOMESTICPLAN");
        System.out.print("Bill amount for " + "DOMESTICPLAN" + " of  " + domasticPlan.getManDate() + " m/d is: " + domasticPlan.calculateBill());

        final IPlan commercialPlan = planFactory.getPlan("COMMERCIALPLAN");
        System.out.print("Bill amount for " + "COMMERCIALPLAN" + " of  " + commercialPlan.getManDate() + " m/d is: " + commercialPlan.calculateBill());

    }
}
