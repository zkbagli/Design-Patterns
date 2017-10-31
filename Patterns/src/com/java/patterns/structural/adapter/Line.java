package com.java.patterns.structural.adapter;

public class Line {

    public void draw(final int xStartPoint,
                     final int yStartPoint,
                     final int xEndPoint,
                     final int yEndPoint) {
        System.out.println("Draw line with coordinates: [" + xStartPoint + "," + yStartPoint + "],[" + xEndPoint + "," + yEndPoint + "]");
    }
}
