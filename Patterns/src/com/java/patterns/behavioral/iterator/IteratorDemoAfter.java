package com.java.patterns.behavioral.iterator;

import java.util.NoSuchElementException;
import java.util.TreeSet;

class SomeClassWithDataEx {
    private final TreeSet<Integer> m_data = new TreeSet<Integer>();

    public class Iterator {
        private final SomeClassWithDataEx m_collection;
        private java.util.Iterator m_it;
        private int m_current;

        public Iterator(final SomeClassWithDataEx in) {
            this.m_collection = in;
        }

        public void first() {
            this.m_it = this.m_collection.m_data.iterator();
            this.next();
        }

        public void next() {
            try {
                this.m_current = (Integer) this.m_it.next();
            } catch (final NoSuchElementException ex) {
                this.m_current = -999;
            }
        }

        public boolean is_done() {
            return this.m_current == -999;
        }

        public int current_item() {
            return this.m_current;
        }
    }

    public void add(final int in) {
        this.m_data.add(in);
    }

    public Iterator create_iterator() {
        return new Iterator(this);
    }
}

class IteratorDemoAfter {
    public static void main(final String[] args) {
        final SomeClassWithDataEx some_object = new SomeClassWithDataEx();
        for (int i = 9; i > 0; --i) {
            some_object.add(i);
        }

        // get_data() has been removed.
        // Client has to use Iterator.
        final SomeClassWithDataEx.Iterator it1 = some_object.create_iterator();
        final SomeClassWithDataEx.Iterator it2 = some_object.create_iterator();

        for (it1.first(); !it1.is_done(); it1.next()) {
            System.out.print(it1.current_item() + "  ");
        }
        System.out.println();

        // Two simultaneous iterations
        for (it1.first(), it2.first(); !it1.is_done(); it1.next(), it2.next()) {
            System.out.print(it1.current_item() + " " + it2.current_item() + "  ");
        }
        System.out.println();
    }
}