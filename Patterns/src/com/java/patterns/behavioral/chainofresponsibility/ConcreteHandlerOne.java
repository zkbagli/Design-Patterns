package com.java.patterns.behavioral.chainofresponsibility;

public class ConcreteHandlerOne extends Handler {
    @Override
    public void handleRequest(final Request request) {
        if (request.getValue() < 0) { // if request is eligible handle it
            System.out.println("Negative values are handled by ConcreteHandlerOne:");
            System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            this.handle(request);
        }
    }
}