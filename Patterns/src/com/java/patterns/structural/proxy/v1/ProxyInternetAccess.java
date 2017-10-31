package com.java.patterns.structural.proxy.v1;

public class ProxyInternetAccess implements OfficeInternetAccess {

    private final String employeeName;

    private final RealInternetAccess realaccess;

    public ProxyInternetAccess(final String employeeName) {
        this.employeeName = employeeName;
        this.realaccess = new RealInternetAccess(this.employeeName);
    }

    @Override
    public void grantInternetAccess() {
        if (this.getRole(this.employeeName) > 4) {
            this.realaccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }

    }

    public int getRole(final String emplName) {
        return 2;
    }

}
