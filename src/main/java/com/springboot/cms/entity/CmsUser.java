package com.springboot.cms.entity;

public class CmsUser {
    private Integer userId;

    private String username;

    private String password;

    private Boolean isAble;

    private String salt;

    private String tel;

    private String email;

    private String userRemark;

    public CmsUser(Integer userId, String username, String password, Boolean isAble, String salt, String tel, String email, String userRemark) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.isAble = isAble;
        this.salt = salt;
        this.tel = tel;
        this.email = email;
        this.userRemark = userRemark;
    }

    @Override
    public String toString() {
        return "CmsUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAble=" + isAble +
                ", salt='" + salt + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", userRemark='" + userRemark + '\'' +
                '}';
    }

    public CmsUser() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getIsAble() {
        return isAble;
    }

    public void setIsAble(Boolean isAble) {
        this.isAble = isAble;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }
}