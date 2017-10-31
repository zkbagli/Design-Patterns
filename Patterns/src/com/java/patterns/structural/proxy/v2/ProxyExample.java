package com.java.patterns.structural.proxy.v2;

import java.lang.reflect.Proxy;

public class ProxyExample {

    public static void main(final String[] args) {
        final Animal realSubject = new Lion();
        final Animal proxy = (Animal) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                                                             realSubject.getClass().getInterfaces(),
                                                             new AnimalInvocationHandler(realSubject));
        proxy.getSound();
    }
}
