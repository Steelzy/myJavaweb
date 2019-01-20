package com.springboot.cms.entity;

public class CmsChannel {
    private Integer channelId;

    private Integer parentId;

    private String channelName;

    private String channelSn;

    private Boolean isDisplay;

    private Integer channelSort;

    private String channelDescription;

    private String channelRemark;

    private String url;

    public CmsChannel(Integer channelId, Integer parentId, String channelName, String channelSn, Boolean isDisplay, Integer channelSort, String channelDescription, String channelRemark, String url) {
        this.channelId = channelId;
        this.parentId = parentId;
        this.channelName = channelName;
        this.channelSn = channelSn;
        this.isDisplay = isDisplay;
        this.channelSort = channelSort;
        this.channelDescription = channelDescription;
        this.channelRemark = channelRemark;
        this.url = url;
    }

    public CmsChannel() {
        super();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelSn() {
        return channelSn;
    }

    public void setChannelSn(String channelSn) {
        this.channelSn = channelSn == null ? null : channelSn.trim();
    }

    public Boolean getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Boolean isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Integer getChannelSort() {
        return channelSort;
    }

    public void setChannelSort(Integer channelSort) {
        this.channelSort = channelSort;
    }

    public String getChannelDescription() {
        return channelDescription;
    }

    public void setChannelDescription(String channelDescription) {
        this.channelDescription = channelDescription == null ? null : channelDescription.trim();
    }

    public String getChannelRemark() {
        return channelRemark;
    }

    public void setChannelRemark(String channelRemark) {
        this.channelRemark = channelRemark == null ? null : channelRemark.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}