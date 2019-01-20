package com.springboot.cms.entity;

public class CmsLink {
    private Integer linkId;

    private String linkName;

    private Integer linkShort;

    private String linkAddress;

    private String linkRemark;

    public CmsLink(Integer linkId, String linkName, Integer linkShort, String linkAddress, String linkRemark) {
        this.linkId = linkId;
        this.linkName = linkName;
        this.linkShort = linkShort;
        this.linkAddress = linkAddress;
        this.linkRemark = linkRemark;
    }

    public CmsLink() {
        super();
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public Integer getLinkShort() {
        return linkShort;
    }

    public void setLinkShort(Integer linkShort) {
        this.linkShort = linkShort;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress == null ? null : linkAddress.trim();
    }

    public String getLinkRemark() {
        return linkRemark;
    }

    public void setLinkRemark(String linkRemark) {
        this.linkRemark = linkRemark == null ? null : linkRemark.trim();
    }

    @Override
    public String toString() {
        return "CmsLink{" +
                "linkId=" + linkId +
                ", linkName='" + linkName + '\'' +
                ", linkShort=" + linkShort +
                ", linkAddress='" + linkAddress + '\'' +
                ", linkRemark='" + linkRemark + '\'' +
                '}';
    }
}