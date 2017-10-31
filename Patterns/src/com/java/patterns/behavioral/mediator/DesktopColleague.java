package com.java.patterns.behavioral.mediator;

public class DesktopColleague extends Colleague {

    public DesktopColleague(final IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(final String message) {
        System.out.println("Desktop Received: " + message);
    }

}
