package com.java.patterns.behavioral.mediator;

public abstract class Colleague {
    private final IMediator mediator;

    public Colleague(final IMediator mediator) {
        this.mediator = mediator;
    }

    public void send(final String message) {
        this.mediator.send(message,
                           this);
    }

    public IMediator getMediator() {
        return this.mediator;
    }

    public abstract void receive(String message);
}
