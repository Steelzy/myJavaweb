package com.springboot.cms.entity;

import java.util.Date;

public class CmsConversation {
    private Integer conversationId;

    private Integer interviewId;

    private String conversationPerson;

    private Date conversationTime;

    private String conversationContent;

    public CmsConversation(Integer conversationId, Integer interviewId, String conversationPerson, Date conversationTime, String conversationContent) {
        this.conversationId = conversationId;
        this.interviewId = interviewId;
        this.conversationPerson = conversationPerson;
        this.conversationTime = conversationTime;
        this.conversationContent = conversationContent;
    }

    public CmsConversation() {
        super();
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public String getConversationPerson() {
        return conversationPerson;
    }

    public void setConversationPerson(String conversationPerson) {
        this.conversationPerson = conversationPerson == null ? null : conversationPerson.trim();
    }

    public Date getConversationTime() {
        return conversationTime;
    }

    public void setConversationTime(Date conversationTime) {
        this.conversationTime = conversationTime;
    }

    public String getConversationContent() {
        return conversationContent;
    }

    public void setConversationContent(String conversationContent) {
        this.conversationContent = conversationContent == null ? null : conversationContent.trim();
    }
}