package com.java.patterns.creational.factory;

class GetPlanFactory {

    public AbstractPlan getPlan(final String planType) {

        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }

        else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }
}