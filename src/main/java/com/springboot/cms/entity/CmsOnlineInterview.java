package com.springboot.cms.entity;

import java.util.Date;

public class CmsOnlineInterview {
    private Integer interviewId;

    private String interviewTitle;

    private String interviewInfo;

    private String interviewTitleImg;

    private String interviewVideo;

    private Date interviewTime;

    private String interviewEmcee;

    private String interviewGuest;

    private Integer interviewState;

    public CmsOnlineInterview(Integer interviewId, String interviewTitle, String interviewInfo, String interviewTitleImg, String interviewVideo, Date interviewTime, String interviewEmcee, String interviewGuest, Integer interviewState) {
        this.interviewId = interviewId;
        this.interviewTitle = interviewTitle;
        this.interviewInfo = interviewInfo;
        this.interviewTitleImg = interviewTitleImg;
        this.interviewVideo = interviewVideo;
        this.interviewTime = interviewTime;
        this.interviewEmcee = interviewEmcee;
        this.interviewGuest = interviewGuest;
        this.interviewState = interviewState;
    }

    public CmsOnlineInterview() {
        super();
    }

    public Integer getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(Integer interviewId) {
        this.interviewId = interviewId;
    }

    public String getInterviewTitle() {
        return interviewTitle;
    }

    public void setInterviewTitle(String interviewTitle) {
        this.interviewTitle = interviewTitle == null ? null : interviewTitle.trim();
    }

    public String getInterviewInfo() {
        return interviewInfo;
    }

    public void setInterviewInfo(String interviewInfo) {
        this.interviewInfo = interviewInfo == null ? null : interviewInfo.trim();
    }

    public String getInterviewTitleImg() {
        return interviewTitleImg;
    }

    public void setInterviewTitleImg(String interviewTitleImg) {
        this.interviewTitleImg = interviewTitleImg == null ? null : interviewTitleImg.trim();
    }

    public String getInterviewVideo() {
        return interviewVideo;
    }

    public void setInterviewVideo(String interviewVideo) {
        this.interviewVideo = interviewVideo == null ? null : interviewVideo.trim();
    }

    public Date getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getInterviewEmcee() {
        return interviewEmcee;
    }

    public void setInterviewEmcee(String interviewEmcee) {
        this.interviewEmcee = interviewEmcee == null ? null : interviewEmcee.trim();
    }

    public String getInterviewGuest() {
        return interviewGuest;
    }

    public void setInterviewGuest(String interviewGuest) {
        this.interviewGuest = interviewGuest == null ? null : interviewGuest.trim();
    }

    public Integer getInterviewState() {
        return interviewState;
    }

    public void setInterviewState(Integer interviewState) {
        this.interviewState = interviewState;
    }
}