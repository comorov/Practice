package com.chyngyz.designpatterns.factorymethod;

/**
 * Created by Chyngyz on 5/20/2021.
 */

public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }
        return null;
    }
}
