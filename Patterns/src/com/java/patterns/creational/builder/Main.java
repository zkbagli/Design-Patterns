package com.java.patterns.creational.builder;

public class Main {

    public static void main(final String[] args) {
        final Pizza pizza = new Pizza.Builder(10).bacon(true).cheese(false).paperoni(true).build();
        System.out.println(pizza);
    }

}
