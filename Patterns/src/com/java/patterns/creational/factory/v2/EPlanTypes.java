package com.java.patterns.creational.factory.v2;

public enum EPlanTypes {
    COMMERTIAL(new CommercialPlanGenerator()),
    DOMESTIC(new DomesticPlanGenerator()),
    INSTITUTIONAL(new InstitutionalPlanGenerator());

    private final IPlanGenerator planGenerator;

    private EPlanTypes(final IPlanGenerator planGenerator) {
        this.planGenerator = planGenerator;

    }

    public IPlanGenerator getPlanGenerator() {
        return this.planGenerator;
    }
}
