package com.java.patterns.behavioral.mediator;

public interface IMediator {
    public void send(String message,
                     Colleague colleague);
}
