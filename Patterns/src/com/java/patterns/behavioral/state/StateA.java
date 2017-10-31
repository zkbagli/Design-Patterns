package com.java.patterns.behavioral.state;

public class StateA implements IState {

    @Override
    public void writeName(final StateContext context,
                          final String name) {
        System.out.println(name.toLowerCase());
        context.setState(new StateB());
    }
}
