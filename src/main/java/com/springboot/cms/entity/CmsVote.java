package com.springboot.cms.entity;

import java.util.Date;

public class CmsVote {
    private Integer voteId;

    private String voteTitle;

    private String voteDescription;

    private Integer voteState;

    private Date voteStart;

    private Date voteEnd;

    public CmsVote(Integer voteId, String voteTitle, String voteDescription, Integer voteState, Date voteStart, Date voteEnd) {
        this.voteId = voteId;
        this.voteTitle = voteTitle;
        this.voteDescription = voteDescription;
        this.voteState = voteState;
        this.voteStart = voteStart;
        this.voteEnd = voteEnd;
    }

    public CmsVote() {
        super();
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public String getVoteTitle() {
        return voteTitle;
    }

    public void setVoteTitle(String voteTitle) {
        this.voteTitle = voteTitle == null ? null : voteTitle.trim();
    }

    public String getVoteDescription() {
        return voteDescription;
    }

    public void setVoteDescription(String voteDescription) {
        this.voteDescription = voteDescription == null ? null : voteDescription.trim();
    }

    public Integer getVoteState() {
        return voteState;
    }

    public void setVoteState(Integer voteState) {
        this.voteState = voteState;
    }

    public Date getVoteStart() {
        return voteStart;
    }

    public void setVoteStart(Date voteStart) {
        this.voteStart = voteStart;
    }

    public Date getVoteEnd() {
        return voteEnd;
    }

    public void setVoteEnd(Date voteEnd) {
        this.voteEnd = voteEnd;
    }
}