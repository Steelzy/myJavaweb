package com.springboot.cms.entity;

public class CmsRolePer {
    private Integer rolePermissionId;

    private Integer roleId;

    private Integer permissionId;

    public CmsRolePer(Integer rolePermissionId, Integer roleId, Integer permissionId) {
        this.rolePermissionId = rolePermissionId;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public CmsRolePer() {
        super();
    }

    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}