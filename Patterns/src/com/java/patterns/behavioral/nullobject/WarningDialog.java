package com.java.patterns.behavioral.nullobject;

public class WarningDialog implements IWarningRouter {

    @Override
    public boolean routeWarning(final String message) {
        System.out.println("WARNING : " + message);
        return true;
    }

}
