package com.springboot.cms.entity;

public class CmsEasyQuery {
    private Integer easyQueryId;

    private String easyQueryTitle;

    private String easyQueryLink;

    public CmsEasyQuery(Integer easyQueryId, String easyQueryTitle, String easyQueryLink) {
        this.easyQueryId = easyQueryId;
        this.easyQueryTitle = easyQueryTitle;
        this.easyQueryLink = easyQueryLink;
    }

    public CmsEasyQuery() {
        super();
    }

    public Integer getEasyQueryId() {
        return easyQueryId;
    }

    public void setEasyQueryId(Integer easyQueryId) {
        this.easyQueryId = easyQueryId;
    }

    public String getEasyQueryTitle() {
        return easyQueryTitle;
    }

    public void setEasyQueryTitle(String easyQueryTitle) {
        this.easyQueryTitle = easyQueryTitle == null ? null : easyQueryTitle.trim();
    }

    public String getEasyQueryLink() {
        return easyQueryLink;
    }

    public void setEasyQueryLink(String easyQueryLink) {
        this.easyQueryLink = easyQueryLink == null ? null : easyQueryLink.trim();
    }
}