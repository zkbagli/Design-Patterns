package com.java.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class CustomerPrototype implements Cloneable {
    private String cutomerType;
    private List<String> roles;
    private List<String> groups;

    private CustomerPrototype() {
    }

    public CustomerPrototype(final String cutomerType) {
        this.cutomerType = cutomerType;
        this.roles = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    public void loadDataFromDB() {
        this.roles.add("role1");
        this.roles.add("role2");
        this.roles.add("role3");
        this.roles.add("role4");
        this.groups.add("group1");
        this.groups.add("group2");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CustomerPrototype().setCutomerType(this.cutomerType).setGroups(this.groups).setRoles(this.roles);
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public List<String> getRoles() {
        return this.roles;
    }

    public String getCutomerType() {
        return this.cutomerType;
    }

    private CustomerPrototype setCutomerType(final String cutomerType) {
        this.cutomerType = cutomerType;
        return this;
    }

    private CustomerPrototype setRoles(final List<String> roles) {
        this.roles = roles;
        return this;
    }

    private CustomerPrototype setGroups(final List<String> groups) {
        this.groups = groups;
        return this;
    }

}
