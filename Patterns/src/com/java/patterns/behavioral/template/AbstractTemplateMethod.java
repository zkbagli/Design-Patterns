package com.java.patterns.behavioral.template;

public abstract class AbstractTemplateMethod {
    private StringBuilder message;

    abstract protected String buildHeader();

    abstract protected String buildBody();

    abstract protected String buildFooter();

    public final String buildMessage() {
        this.message = new StringBuilder();
        this.message.append(this.buildHeader());
        this.message.append(this.buildBody());
        this.message.append(this.buildFooter());
        return this.message.toString();
    }
}
