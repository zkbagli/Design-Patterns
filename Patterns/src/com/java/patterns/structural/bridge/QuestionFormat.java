package com.java.patterns.structural.bridge;

public class QuestionFormat extends QuestionManager {

    public QuestionFormat(final String catalog) {
        super(catalog);
    }

    @Override
    public void displayAll() {

        System.out.println("\n--------------------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------------------");
    }

}
