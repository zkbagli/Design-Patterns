package com.java.patterns.behavioral.interpreter;

public class InterpreterContext {

    public String getBinaryFormat(final int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(final int i) {
        return Integer.toHexString(i);
    }
}
