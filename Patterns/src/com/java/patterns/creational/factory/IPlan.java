package com.java.patterns.creational.factory;

public interface IPlan {

    public abstract double getRate();

    public abstract double getManDate();

    public double calculateBill();

}
