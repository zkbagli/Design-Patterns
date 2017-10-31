package com.java.patterns.structural.decorator;

public class StarbuzzCoffee {

    public static void main(final String args[]) {
        final Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        final Beverage beverage2 = new Whip(new Mocha(new Milk(new DarkRoast())));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        final Beverage beverage3 = new Soy(new Mocha(new Whip(new HouseBlend())));
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
