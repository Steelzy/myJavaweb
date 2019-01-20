package com.springboot.cms.entity;

public class CmsPermission {
    private Integer permissionId;

    private Integer moduleId;

    private String permissionName;

    private String perShortName;

    private String permissionDescript;

    public CmsPermission(Integer permissionId, Integer moduleId, String permissionName, String perShortName, String permissionDescript) {
        this.permissionId = permissionId;
        this.moduleId = moduleId;
        this.permissionName = permissionName;
        this.perShortName = perShortName;
        this.permissionDescript = permissionDescript;
    }

    public CmsPermission() {
        super();
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPerShortName() {
        return perShortName;
    }

    public void setPerShortName(String perShortName) {
        this.perShortName = perShortName == null ? null : perShortName.trim();
    }

    public String getPermissionDescript() {
        return permissionDescript;
    }

    public void setPermissionDescript(String permissionDescript) {
        this.permissionDescript = permissionDescript == null ? null : permissionDescript.trim();
    }
}