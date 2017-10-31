package com.java.patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

    private final List<String> questions = new ArrayList<String>();

    private int current = 0;

    public JavaQuestions() {
        this.questions.add("What is class? ");
        this.questions.add("What is interface? ");
        this.questions.add("What is abstraction? ");
        this.questions.add("How multiple polymorphism is achieved in java? ");
        this.questions.add("How many types of exception  handling are there in java? ");
        this.questions.add("Define the keyword final for  variable, method, and class in java? ");
        this.questions.add("What is abstract class? ");
        this.questions.add("What is multi-threading? ");

    }

    @Override
    public void nextQuestion() {
        if (this.current <= (this.questions.size() - 1)) {
            this.current++;
        }
    }

    @Override
    public void previousQuestion() {
        if (this.current > 0) {
            this.current--;
        }

    }

    @Override
    public void newQuestion(final String quest) {
        this.questions.add(quest);
    }

    @Override
    public void deleteQuestion(final String quest) {
        this.questions.remove(quest);
    }

    @Override
    public void displayQuestion() {
        System.out.println(this.questions.get(this.current));
    }

    @Override
    public void displayAllQuestions() {
        for (final String quest : this.questions) {
            System.out.println(quest);
        }
    }

}
