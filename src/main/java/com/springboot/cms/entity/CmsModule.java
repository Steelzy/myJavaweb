package com.springboot.cms.entity;

public class CmsModule {
    private Integer moduleId;

    private String moduleName;

    private String shortName;

    private String url;

    private Integer priority;

    private Integer parentId;

    private String moduleDescript;

    public CmsModule(Integer moduleId, String moduleName, String shortName, String url, Integer priority, Integer parentId, String moduleDescript) {
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.shortName = shortName;
        this.url = url;
        this.priority = priority;
        this.parentId = parentId;
        this.moduleDescript = moduleDescript;
    }

    public CmsModule() {
        super();
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getModuleDescript() {
        return moduleDescript;
    }

    public void setModuleDescript(String moduleDescript) {
        this.moduleDescript = moduleDescript == null ? null : moduleDescript.trim();
    }
}