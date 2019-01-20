package com.springboot.cms.entity;

import java.util.Date;

public class CmsUserQuestions {
    private Integer questionId;

    private Integer interviewId;

    private String questionUser;

    private Date questionTime;

    private String questionContent;

    public CmsUserQuestions(Integer questionId, Integer interviewId, String questionUser, Date questionTime, String questionContent) {
        this.questionId = questionId;
        this.interviewId = interviewId;
        this.questionUser = questionUser;
        this.questionTime = questionTime;
        this.questionContent = questionContent;
    }

    public CmsUserQuestions() {
        super();
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public String getQuestionUser() {
        return questionUser;
    }

    public void setQuestionUser(String questionUser) {
        this.questionUser = questionUser == null ? null : questionUser.trim();
    }

    public Date getQuestionTime() {
        return questionTime;
    }

    public void setQuestionTime(Date questionTime) {
        this.questionTime = questionTime;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }
}