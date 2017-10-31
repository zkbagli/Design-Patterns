package com.java.patterns.behavioral.chainofresponsibility;

public class ConcreteHandlerThree extends Handler {
    @Override
    public void handleRequest(final Request request) {
        if (request.getValue() >= 0) { // if request is eligible handle it
            System.out.println("Zero values are handled by ConcreteHandlerThree:");
            System.out.println("\tConcreteHandlerThree.HandleRequest : " + request.getDescription() + request.getValue());
        } else {
            this.handle(request);
        }
    }
}