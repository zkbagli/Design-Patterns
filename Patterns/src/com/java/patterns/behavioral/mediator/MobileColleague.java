package com.java.patterns.behavioral.mediator;

public class MobileColleague extends Colleague {

    public MobileColleague(final IMediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(final String message) {
        System.out.println("Mobile Received: " + message);
    }
}
