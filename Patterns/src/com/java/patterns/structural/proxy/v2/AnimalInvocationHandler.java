package com.java.patterns.structural.proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {
    public AnimalInvocationHandler(final Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(final Object proxy,
                         final Method m,
                         final Object[] args) {
        Object result = null;
        try {
            result = m.invoke(this.realSubject,
                              args);
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }

    private Object realSubject = null;
}