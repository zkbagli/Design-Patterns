package com.java.patterns.structural.proxy.v1;

public class ProxyPatternClient {

    public static void main(final String[] args) {
        final OfficeInternetAccess access = new ProxyInternetAccess("Osman");

        access.grantInternetAccess();
    }

}
