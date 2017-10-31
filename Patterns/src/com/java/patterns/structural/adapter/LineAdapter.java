package com.java.patterns.structural.adapter;

public class LineAdapter implements IShape {

    private final Line adaptee = new Line();

    @Override
    public void draw(final int x1,
                     final int y1,
                     final int x2,
                     final int y2) {
        this.adaptee.draw(x1,
                          y1,
                          x2,
                          y2);
    }

}
