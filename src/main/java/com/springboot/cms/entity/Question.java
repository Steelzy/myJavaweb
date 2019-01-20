package com.springboot.cms.entity;

public class Question {
    private int QuestionId;

    private String QuestionName;


    private String AnswerA;

    private String AnswerB;

    private String AnswerC;

    private String AnswerD;

    public Question(){

    }
    public Question(int questionId, String questionName, String answerA, String answerB, String answerC, String answerD) {
        QuestionId = questionId;
        QuestionName = questionName;
        AnswerA = answerA;
        AnswerB = answerB;
        AnswerC = answerC;
        AnswerD = answerD;
    }

    public int getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(int questionId) {
        QuestionId = questionId;
    }

    public String getQuestionName() {
        return QuestionName;
    }

    public void setQuestionName(String questionName) {
        QuestionName = questionName;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public void setAnswerD(String answerD) {
        AnswerD = answerD;
    }

    @Override
    public String toString() {
        return "Question{" +
                "QuestionId=" + QuestionId +
                ", QuestionName='" + QuestionName + '\'' +
                ", AnswerA='" + AnswerA + '\'' +
                ", AnswerB='" + AnswerB + '\'' +
                ", AnswerC='" + AnswerC + '\'' +
                ", AnswerD='" + AnswerD + '\'' +
                '}';
    }
}