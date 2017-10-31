package com.java.patterns.behavioral.chainofresponsibility;

public abstract class Handler {
    private Handler successor;

    public Handler setSuccessor(final Handler successor) {
        this.successor = successor;
        return this.successor;
    }

    protected void handle(final Request request) {
        this.successor.handle(request);
    }

    public abstract void handleRequest(Request request);
}