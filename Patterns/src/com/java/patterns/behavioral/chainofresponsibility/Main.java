package com.java.patterns.behavioral.chainofresponsibility;

public class Main {
    public static void main(final String[] args) {
        // Setup Chain of Responsibility
        final Handler h1 = new ConcreteHandlerOne();
        final Handler h2 = new ConcreteHandlerTwo();
        final Handler h3 = new ConcreteHandlerThree();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ",
                                     -1));
        h1.handleRequest(new Request("Negative Value ",
                                     0));
        h1.handleRequest(new Request("Negative Value ",
                                     1));
        h1.handleRequest(new Request("Negative Value ",
                                     2));
        h1.handleRequest(new Request("Negative Value ",
                                     -5));
    }
}