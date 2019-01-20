package com.springboot.cms.entity;

import java.util.Date;

public class CmsDownload {
    private Integer fileId;

    private String fileName;

    private String fileInfo;

    private String filePublishUser;

    private String fileUrl;

    private Integer downloadTimes;

    private Date uploadTime;

    private String fileGetPassword;

    private String fileRemark;

    public CmsDownload(Integer fileId, String fileName, String fileInfo, String filePublishUser, String fileUrl, Integer downloadTimes, Date uploadTime, String fileGetPassword, String fileRemark) {
        this.fileId = fileId;
        this.fileName = fileName;
        this.fileInfo = fileInfo;
        this.filePublishUser = filePublishUser;
        this.fileUrl = fileUrl;
        this.downloadTimes = downloadTimes;
        this.uploadTime = uploadTime;
        this.fileGetPassword = fileGetPassword;
        this.fileRemark = fileRemark;
    }

    public CmsDownload() {
        super();
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo == null ? null : fileInfo.trim();
    }

    public String getFilePublishUser() {
        return filePublishUser;
    }

    public void setFilePublishUser(String filePublishUser) {
        this.filePublishUser = filePublishUser == null ? null : filePublishUser.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Integer getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(Integer downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getFileGetPassword() {
        return fileGetPassword;
    }

    public void setFileGetPassword(String fileGetPassword) {
        this.fileGetPassword = fileGetPassword == null ? null : fileGetPassword.trim();
    }

    public String getFileRemark() {
        return fileRemark;
    }

    public void setFileRemark(String fileRemark) {
        this.fileRemark = fileRemark == null ? null : fileRemark.trim();
    }
}