package com.java.patterns.behavioral.momento;

import java.util.ArrayList;

public class Caretaker {
    private final ArrayList<Memento> statesList = new ArrayList<Memento>();

    public void addMemento(final Memento m) {
        this.statesList.add(m);
    }

    public Memento getMemento(final int index) {
        return this.statesList.get(index);
    }
}
