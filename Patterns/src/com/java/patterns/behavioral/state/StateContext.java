package com.java.patterns.behavioral.state;

public class StateContext {

    IState state;

    public StateContext() {
        this.setState(new StateA());
    }

    public void setState(final IState state) {
        this.state = state;
    }

    public void writeName(final String name) {
        this.state.writeName(this,
                             name);
    }
}
