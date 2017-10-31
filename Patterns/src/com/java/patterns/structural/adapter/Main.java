package com.java.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {
        final List<IShape> shapes = new ArrayList<IShape>();
        shapes.add(new LineAdapter());
        shapes.add(new RectangleAdapter());

        for (final IShape shape : shapes) {
            shape.draw(10,
                       10,
                       30,
                       30);
        }

    }

}
