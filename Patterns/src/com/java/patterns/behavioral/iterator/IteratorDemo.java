package com.java.patterns.behavioral.iterator;

import java.util.Collection;
import java.util.TreeSet;

class SomeClassWithData {
    private final TreeSet<Integer> m_data = new TreeSet<Integer>();

    public void add(final int in) {
        this.m_data.add(in);
    }

    public Collection get_data() {
        return this.m_data;
    }
}

class IteratorDemo {
    public static void main(final String[] args) {
        final SomeClassWithData some_object = new SomeClassWithData();
        for (int i = 9; i > 0; --i) {
            some_object.add(i);
        }
        Collection data = some_object.get_data();
        for (final java.util.Iterator it = data.iterator(); it.hasNext();) {
            System.out.print(it.next() + "  ");
        }
        System.out.println();

        // Do we really want a client to be able to
        // trash encapsulated state?
        data.clear();
        data = some_object.get_data();
        System.out.println("size of data is " + data.size());
    }
}