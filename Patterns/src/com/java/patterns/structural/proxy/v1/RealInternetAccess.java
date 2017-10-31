package com.java.patterns.structural.proxy.v1;

public class RealInternetAccess implements OfficeInternetAccess {

    private final String employeeName;

    public RealInternetAccess(final String empName) {
        this.employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println(" \n Internet Access granted for employee: " + this.employeeName);
    }

}
