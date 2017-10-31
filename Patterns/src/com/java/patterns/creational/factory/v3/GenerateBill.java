package com.java.patterns.creational.factory.v3;

import java.util.ServiceLoader;

import com.java.patterns.creational.factory.IPlan;

public class GenerateBill {
    public static void main(final String[] args) {
        final ServiceLoader<IPlan> load = ServiceLoader.load(IPlan.class);
        for (final IPlan iPlan : load) {
            System.out.println(iPlan.toString() + " bill : " + iPlan.calculateBill());
        }
    }
}
