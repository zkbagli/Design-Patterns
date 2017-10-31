package com.java.patterns.behavioral.momento;

public class Originator {

    private String state;

    public void setState(final String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(final Memento memento) {
        this.state = memento.getState();
    }
}
