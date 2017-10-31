package com.java.patterns.behavioral.momento;

public class Memento {
    private String state;

    public Memento(final String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }

}
