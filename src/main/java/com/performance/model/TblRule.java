package com.performance.model;

public class TblRule {
    private Integer ruleId;

    private Integer ruleSource;

    private String ruleText;

    private String ruleMethod;

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getRuleSource() {
        return ruleSource;
    }

    public void setRuleSource(Integer ruleSource) {
        this.ruleSource = ruleSource;
    }

    public String getRuleText() {
        return ruleText;
    }

    public void setRuleText(String ruleText) {
        this.ruleText = ruleText == null ? null : ruleText.trim();
    }

    public String getRuleMethod() {
        return ruleMethod;
    }

    public void setRuleMethod(String ruleMethod) {
        this.ruleMethod = ruleMethod == null ? null : ruleMethod.trim();
    }
}