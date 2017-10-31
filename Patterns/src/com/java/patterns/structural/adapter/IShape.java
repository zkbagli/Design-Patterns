package com.java.patterns.structural.adapter;

public interface IShape {

    /**
     * @param x1
     *            left upper coordinate
     * @param y1
     *            left upper coordinate
     * @param x2
     *            right bottom coordinate
     * @param y2
     *            right bottom coordinate
     */
    public void draw(int x1,
                     int y1,
                     int x2,
                     int y2);
}
