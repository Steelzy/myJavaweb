package com.springboot.cms.entity;

public class CmsUserRole {
    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;

    public CmsUserRole(Integer userRoleId, Integer userId, Integer roleId) {
        this.userRoleId = userRoleId;
        this.userId = userId;
        this.roleId = roleId;
    }

    public CmsUserRole() {
        super();
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}