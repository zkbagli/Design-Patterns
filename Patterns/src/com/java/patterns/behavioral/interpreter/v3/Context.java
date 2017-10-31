package com.java.patterns.behavioral.interpreter.v3;

public class Context {

    private String input;
    private int output;

    public Context(final String input) {
        this.input = input;
    }

    public String getInput() {
        return this.input;
    }

    public void setInput(final String input) {
        this.input = input;
    }

    public int getOutput() {
        return this.output;
    }

    public void setOutput(final int output) {
        this.output = output;
    }

}