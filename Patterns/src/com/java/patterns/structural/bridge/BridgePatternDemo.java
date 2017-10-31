package com.java.patterns.structural.bridge;

public class BridgePatternDemo {

    public static void main(final String[] args) {

        final QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.setQuestion(new JavaQuestions());
        questions.next();
        questions.display();
        questions.delete("what is class?");
        questions.newOne("What is inheritance? ");
        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();
    }

}
