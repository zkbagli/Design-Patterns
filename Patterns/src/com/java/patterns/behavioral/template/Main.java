package com.java.patterns.behavioral.template;

public class Main {

    public static void main(final String[] args) {
        final AbstractTemplateMethod html = new HtmlBuilder();
        System.out.println(html.buildMessage());

        final AbstractTemplateMethod soap = new SoapBuilder();
        System.out.println(soap.buildMessage());
    }

}
