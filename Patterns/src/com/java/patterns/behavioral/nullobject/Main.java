package com.java.patterns.behavioral.nullobject;

public class Main {

    public static void main(final String[] args) {
        final IWarningRouter router1 = new WarningDialog();
        router1.routeWarning("Some message!");

        final IWarningRouter router2 = new IgnoreWarning();
        router2.routeWarning("Nothing to happed!");
    }

}
