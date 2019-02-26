// Ocean Lu
// CS14
// Assignment 3
// 11.06.17

import java.util.Scanner;

public class Question {

    private final int NUM_ANSWERS = 4;
    private String questionText;
    private String[] possibleAnswers = new String[NUM_ANSWERS];
    private int correctAnswer;

    public Question() {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
        
    }

    public void setQuestion(String question) {
        questionText = question;
    }

    public void setPossibleAnswer(String text, int num) {
        possibleAnswers[num] = text;
        correctAnswer = num;
    }

    public void setCorrectAnswerNum(int num) {
        correctAnswer = num;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getPossibleAnswer(int num) {
        return possibleAnswers[num];
    }

    public int getCorrectAnswerNumber() {
        return correctAnswer + 1;
    }

    public String getCorrectAnswer() {
        return possibleAnswers[correctAnswer];
    }
}

