package com.java.patterns.structural.adapter;

public class RectangleAdapter implements IShape {

    private final Rectangle adaptee = new Rectangle();

    @Override
    public void draw(final int x1,
                     final int y1,
                     final int x2,
                     final int y2) {
        this.adaptee.draw(x1,
                          y1,
                          Math.abs(x2 - x1),
                          Math.abs(y2 - y1));
    }

}
