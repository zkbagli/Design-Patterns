package com.java.patterns.behavioral.template;

public class HtmlBuilder extends AbstractTemplateMethod {

    @Override
    protected String buildHeader() {
        return "<html>\r\n\t<head>\r\n\t\t<title>My first HTML page</title>\r\n\t</head>\r\n";
    }

    @Override
    protected String buildBody() {
        return "\t<body> HTML Body </Body>\r\n";
    }

    @Override
    protected String buildFooter() {
        return "</html>";
    }

}
