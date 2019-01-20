package com.springboot.cms.entity;

import java.util.Date;

public class CmsContent {
    private Integer contentId;

    private Integer channelId;

    private Integer userId;

    private Boolean hasContentPic;

    private String contentType;

    private Date contentDate;

    private Integer viewTimes;

    private Integer contentStatus;

    private Boolean conIsStatic;

    private Integer originCounty;

    private Integer contentMediaType;

    public CmsContent(Integer contentId, Integer channelId, Integer userId, Boolean hasContentPic, String contentType, Date contentDate, Integer viewTimes, Integer contentStatus, Boolean conIsStatic, Integer originCounty, Integer contentMediaType) {
        this.contentId = contentId;
        this.channelId = channelId;
        this.userId = userId;
        this.hasContentPic = hasContentPic;
        this.contentType = contentType;
        this.contentDate = contentDate;
        this.viewTimes = viewTimes;
        this.contentStatus = contentStatus;
        this.conIsStatic = conIsStatic;
        this.originCounty = originCounty;
        this.contentMediaType = contentMediaType;
    }

    public CmsContent() {
        super();
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getHasContentPic() {
        return hasContentPic;
    }

    public void setHasContentPic(Boolean hasContentPic) {
        this.hasContentPic = hasContentPic;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public Date getContentDate() {
        return contentDate;
    }

    public void setContentDate(Date contentDate) {
        this.contentDate = contentDate;
    }

    public Integer getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(Integer viewTimes) {
        this.viewTimes = viewTimes;
    }

    public Integer getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(Integer contentStatus) {
        this.contentStatus = contentStatus;
    }

    public Boolean getConIsStatic() {
        return conIsStatic;
    }

    public void setConIsStatic(Boolean conIsStatic) {
        this.conIsStatic = conIsStatic;
    }

    public Integer getOriginCounty() {
        return originCounty;
    }

    public void setOriginCounty(Integer originCounty) {
        this.originCounty = originCounty;
    }

    public Integer getContentMediaType() {
        return contentMediaType;
    }

    public void setContentMediaType(Integer contentMediaType) {
        this.contentMediaType = contentMediaType;
    }
}