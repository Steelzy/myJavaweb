package com.springboot.cms.entity;

public class CmsRole {
    private Integer roleId;

    private String roleName;

    private Boolean roleStatus;

    private String roleDescript;

    public CmsRole(Integer roleId, String roleName, Boolean roleStatus, String roleDescript) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleStatus = roleStatus;
        this.roleDescript = roleDescript;
    }

    public CmsRole() {
        super();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Boolean getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getRoleDescript() {
        return roleDescript;
    }

    public void setRoleDescript(String roleDescript) {
        this.roleDescript = roleDescript == null ? null : roleDescript.trim();
    }
}