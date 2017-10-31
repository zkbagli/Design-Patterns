package com.java.patterns.behavioral.nullobject;

public class IgnoreWarning implements IWarningRouter {

    @Override
    public boolean routeWarning(final String message) {
        return true;
    }

}
