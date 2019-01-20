package com.springboot.cms.entity;

public class CmsContentExt {
    private Integer contentExtId;

    private String contentTitle;

    private String contentSn;

    private Boolean isBlod;

    private String titleColor;

    private String contentPicUrl;

    private String contentAuthor;

    private String contentOrigin;

    private String contentStaticUrl;

    private String contentVideoUrl;

    private String contentMediaUrl;

    private Boolean hasContentAttach;

    private String attachUrl;

    public CmsContentExt(Integer contentExtId, String contentTitle, String contentSn, Boolean isBlod, String titleColor, String contentPicUrl, String contentAuthor, String contentOrigin, String contentStaticUrl, String contentVideoUrl, String contentMediaUrl, Boolean hasContentAttach, String attachUrl) {
        this.contentExtId = contentExtId;
        this.contentTitle = contentTitle;
        this.contentSn = contentSn;
        this.isBlod = isBlod;
        this.titleColor = titleColor;
        this.contentPicUrl = contentPicUrl;
        this.contentAuthor = contentAuthor;
        this.contentOrigin = contentOrigin;
        this.contentStaticUrl = contentStaticUrl;
        this.contentVideoUrl = contentVideoUrl;
        this.contentMediaUrl = contentMediaUrl;
        this.hasContentAttach = hasContentAttach;
        this.attachUrl = attachUrl;
    }

    public CmsContentExt() {
        super();
    }

    public Integer getContentExtId() {
        return contentExtId;
    }

    public void setContentExtId(Integer contentExtId) {
        this.contentExtId = contentExtId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    public String getContentSn() {
        return contentSn;
    }

    public void setContentSn(String contentSn) {
        this.contentSn = contentSn == null ? null : contentSn.trim();
    }

    public Boolean getIsBlod() {
        return isBlod;
    }

    public void setIsBlod(Boolean isBlod) {
        this.isBlod = isBlod;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor == null ? null : titleColor.trim();
    }

    public String getContentPicUrl() {
        return contentPicUrl;
    }

    public void setContentPicUrl(String contentPicUrl) {
        this.contentPicUrl = contentPicUrl == null ? null : contentPicUrl.trim();
    }

    public String getContentAuthor() {
        return contentAuthor;
    }

    public void setContentAuthor(String contentAuthor) {
        this.contentAuthor = contentAuthor == null ? null : contentAuthor.trim();
    }

    public String getContentOrigin() {
        return contentOrigin;
    }

    public void setContentOrigin(String contentOrigin) {
        this.contentOrigin = contentOrigin == null ? null : contentOrigin.trim();
    }

    public String getContentStaticUrl() {
        return contentStaticUrl;
    }

    public void setContentStaticUrl(String contentStaticUrl) {
        this.contentStaticUrl = contentStaticUrl == null ? null : contentStaticUrl.trim();
    }

    public String getContentVideoUrl() {
        return contentVideoUrl;
    }

    public void setContentVideoUrl(String contentVideoUrl) {
        this.contentVideoUrl = contentVideoUrl == null ? null : contentVideoUrl.trim();
    }

    public String getContentMediaUrl() {
        return contentMediaUrl;
    }

    public void setContentMediaUrl(String contentMediaUrl) {
        this.contentMediaUrl = contentMediaUrl == null ? null : contentMediaUrl.trim();
    }

    public Boolean getHasContentAttach() {
        return hasContentAttach;
    }

    public void setHasContentAttach(Boolean hasContentAttach) {
        this.hasContentAttach = hasContentAttach;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl == null ? null : attachUrl.trim();
    }
}