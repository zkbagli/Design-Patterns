package com.java.patterns.behavioral.chainofresponsibility;

public class Request {
    private final int m_value;
    private final String m_description;

    public Request(final String description,
                   final int value) {
        this.m_description = description;
        this.m_value = value;
    }

    public int getValue() {
        return this.m_value;
    }

    public String getDescription() {
        return this.m_description;
    }
}