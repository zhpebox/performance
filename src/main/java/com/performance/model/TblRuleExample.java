package com.performance.model;

import java.util.ArrayList;
import java.util.List;

public class TblRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblRuleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleSourceIsNull() {
            addCriterion("rule_source is null");
            return (Criteria) this;
        }

        public Criteria andRuleSourceIsNotNull() {
            addCriterion("rule_source is not null");
            return (Criteria) this;
        }

        public Criteria andRuleSourceEqualTo(Integer value) {
            addCriterion("rule_source =", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceNotEqualTo(Integer value) {
            addCriterion("rule_source <>", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceGreaterThan(Integer value) {
            addCriterion("rule_source >", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_source >=", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceLessThan(Integer value) {
            addCriterion("rule_source <", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceLessThanOrEqualTo(Integer value) {
            addCriterion("rule_source <=", value, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceIn(List<Integer> values) {
            addCriterion("rule_source in", values, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceNotIn(List<Integer> values) {
            addCriterion("rule_source not in", values, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceBetween(Integer value1, Integer value2) {
            addCriterion("rule_source between", value1, value2, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_source not between", value1, value2, "ruleSource");
            return (Criteria) this;
        }

        public Criteria andRuleTextIsNull() {
            addCriterion("rule_text is null");
            return (Criteria) this;
        }

        public Criteria andRuleTextIsNotNull() {
            addCriterion("rule_text is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTextEqualTo(String value) {
            addCriterion("rule_text =", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextNotEqualTo(String value) {
            addCriterion("rule_text <>", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextGreaterThan(String value) {
            addCriterion("rule_text >", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextGreaterThanOrEqualTo(String value) {
            addCriterion("rule_text >=", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextLessThan(String value) {
            addCriterion("rule_text <", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextLessThanOrEqualTo(String value) {
            addCriterion("rule_text <=", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextLike(String value) {
            addCriterion("rule_text like", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextNotLike(String value) {
            addCriterion("rule_text not like", value, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextIn(List<String> values) {
            addCriterion("rule_text in", values, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextNotIn(List<String> values) {
            addCriterion("rule_text not in", values, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextBetween(String value1, String value2) {
            addCriterion("rule_text between", value1, value2, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleTextNotBetween(String value1, String value2) {
            addCriterion("rule_text not between", value1, value2, "ruleText");
            return (Criteria) this;
        }

        public Criteria andRuleMethodIsNull() {
            addCriterion("rule_method is null");
            return (Criteria) this;
        }

        public Criteria andRuleMethodIsNotNull() {
            addCriterion("rule_method is not null");
            return (Criteria) this;
        }

        public Criteria andRuleMethodEqualTo(String value) {
            addCriterion("rule_method =", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodNotEqualTo(String value) {
            addCriterion("rule_method <>", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodGreaterThan(String value) {
            addCriterion("rule_method >", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodGreaterThanOrEqualTo(String value) {
            addCriterion("rule_method >=", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodLessThan(String value) {
            addCriterion("rule_method <", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodLessThanOrEqualTo(String value) {
            addCriterion("rule_method <=", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodLike(String value) {
            addCriterion("rule_method like", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodNotLike(String value) {
            addCriterion("rule_method not like", value, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodIn(List<String> values) {
            addCriterion("rule_method in", values, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodNotIn(List<String> values) {
            addCriterion("rule_method not in", values, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodBetween(String value1, String value2) {
            addCriterion("rule_method between", value1, value2, "ruleMethod");
            return (Criteria) this;
        }

        public Criteria andRuleMethodNotBetween(String value1, String value2) {
            addCriterion("rule_method not between", value1, value2, "ruleMethod");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}