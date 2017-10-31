package com.java.patterns.behavioral.chainofresponsibility;

public class ConcreteHandlerTwo extends Handler {
    @Override
    public void handleRequest(final Request request) {
        if (request.getValue() > 0) {
            System.out.println("Positive values are handled by ConcreteHandlerTwo:");
            System.out.println("\tConcreteHandlerTwo.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            this.handle(request);
        }
    }
}