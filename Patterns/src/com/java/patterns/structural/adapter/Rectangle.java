package com.java.patterns.structural.adapter;

public class Rectangle {

    public void draw(final int xUpperLeft,
                     final int yUpperLeft,
                     final int width,
                     final int height) {
        System.out.println("Draw rectangle: with start cooridanates coordinates: [" + xUpperLeft + "," + yUpperLeft + "], Width=" + width + ", Height=" + height);
    }
}
