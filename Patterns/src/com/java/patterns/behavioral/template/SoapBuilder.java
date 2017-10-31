package com.java.patterns.behavioral.template;

public class SoapBuilder extends AbstractTemplateMethod {

    @Override
    protected String buildHeader() {
        return "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n";
    }

    @Override
    protected String buildBody() {
        return "\t<Body>\r\n\t\t<helloWorld/>\r\n\t</Body>\r\n";
    }

    @Override
    protected String buildFooter() {
        return "</Envelope>";
    }

}
