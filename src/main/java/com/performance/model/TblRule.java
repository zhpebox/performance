package com.performance.model;

public class TblRule {
    private Integer ruleId;

    private String ruleName;

    private Integer ruleSource;

    private String paramFile;

    private String className;

    private String methodName;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Integer getRuleSource() {
        return ruleSource;
    }

    public void setRuleSource(Integer ruleSource) {
        this.ruleSource = ruleSource;
    }

    public String getParamFile() {
        return paramFile;
    }

    public void setParamFile(String paramFile) {
        this.paramFile = paramFile == null ? null : paramFile.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }
}