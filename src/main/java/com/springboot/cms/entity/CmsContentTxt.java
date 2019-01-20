package com.springboot.cms.entity;

public class CmsContentTxt {
    private Integer contentTxtId;

    private String txt;

    public CmsContentTxt(Integer contentTxtId, String txt) {
        this.contentTxtId = contentTxtId;
        this.txt = txt;
    }

    public CmsContentTxt() {
        super();
    }

    public Integer getContentTxtId() {
        return contentTxtId;
    }

    public void setContentTxtId(Integer contentTxtId) {
        this.contentTxtId = contentTxtId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt == null ? null : txt.trim();
    }
}