package com.java.patterns.behavioral.state;

public class StateB implements IState {

    @Override
    public void writeName(final StateContext context,
                          final String name) {
        System.out.println(name.toUpperCase());
        context.setState(new StateA());
    }

}
