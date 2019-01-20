package com.springboot.cms.entity;

import java.util.Date;

public class CmsVotingObject {
    private Integer personId;

    private Integer voteId;

    private Integer votingCounts;

    private Integer votingSex;

    private String votingPic;

    private Date votingTime;

    private String personName;

    private String personDescription;

    public CmsVotingObject(Integer personId, Integer voteId, Integer votingCounts, Integer votingSex, String votingPic, Date votingTime, String personName, String personDescription) {
        this.personId = personId;
        this.voteId = voteId;
        this.votingCounts = votingCounts;
        this.votingSex = votingSex;
        this.votingPic = votingPic;
        this.votingTime = votingTime;
        this.personName = personName;
        this.personDescription = personDescription;
    }

    public CmsVotingObject() {
        super();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getVoteId() {
        return voteId;
    }

    public void setVoteId(Integer voteId) {
        this.voteId = voteId;
    }

    public Integer getVotingCounts() {
        return votingCounts;
    }

    public void setVotingCounts(Integer votingCounts) {
        this.votingCounts = votingCounts;
    }

    public Integer getVotingSex() {
        return votingSex;
    }

    public void setVotingSex(Integer votingSex) {
        this.votingSex = votingSex;
    }

    public String getVotingPic() {
        return votingPic;
    }

    public void setVotingPic(String votingPic) {
        this.votingPic = votingPic == null ? null : votingPic.trim();
    }

    public Date getVotingTime() {
        return votingTime;
    }

    public void setVotingTime(Date votingTime) {
        this.votingTime = votingTime;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonDescription() {
        return personDescription;
    }

    public void setPersonDescription(String personDescription) {
        this.personDescription = personDescription == null ? null : personDescription.trim();
    }
}