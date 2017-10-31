package com.java.patterns.structural.bridge;

public class QuestionManager {

    private Question question;

    public String catalog;

    public QuestionManager(final String catalog) {
        this.catalog = catalog;
    }

    public void next() {
        this.getQuestion().nextQuestion();
    }

    public void previous() {
        this.getQuestion().previousQuestion();
    }

    public void newOne(final String quest) {
        this.getQuestion().newQuestion(quest);
    }

    public void delete(final String quest) {
        this.getQuestion().deleteQuestion(quest);
    }

    public void display() {
        this.getQuestion().displayQuestion();
    }

    public void displayAll() {
        System.out.println("Question Paper: " + this.catalog);
        this.getQuestion().displayAllQuestions();
    }

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(final Question question) {
        this.question = question;
    }

}
