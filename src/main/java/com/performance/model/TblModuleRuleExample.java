package com.performance.model;

import java.util.ArrayList;
import java.util.List;

public class TblModuleRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblModuleRuleExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIsNull() {
            addCriterion("module_key is null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIsNotNull() {
            addCriterion("module_key is not null");
            return (Criteria) this;
        }

        public Criteria andModuleKeyEqualTo(Integer value) {
            addCriterion("module_key =", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotEqualTo(Integer value) {
            addCriterion("module_key <>", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThan(Integer value) {
            addCriterion("module_key >", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("module_key >=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThan(Integer value) {
            addCriterion("module_key <", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyLessThanOrEqualTo(Integer value) {
            addCriterion("module_key <=", value, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyIn(List<Integer> values) {
            addCriterion("module_key in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotIn(List<Integer> values) {
            addCriterion("module_key not in", values, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyBetween(Integer value1, Integer value2) {
            addCriterion("module_key between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andModuleKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("module_key not between", value1, value2, "moduleKey");
            return (Criteria) this;
        }

        public Criteria andParamIndexIsNull() {
            addCriterion("param_index is null");
            return (Criteria) this;
        }

        public Criteria andParamIndexIsNotNull() {
            addCriterion("param_index is not null");
            return (Criteria) this;
        }

        public Criteria andParamIndexEqualTo(Integer value) {
            addCriterion("param_index =", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexNotEqualTo(Integer value) {
            addCriterion("param_index <>", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexGreaterThan(Integer value) {
            addCriterion("param_index >", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("param_index >=", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexLessThan(Integer value) {
            addCriterion("param_index <", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexLessThanOrEqualTo(Integer value) {
            addCriterion("param_index <=", value, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexIn(List<Integer> values) {
            addCriterion("param_index in", values, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexNotIn(List<Integer> values) {
            addCriterion("param_index not in", values, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexBetween(Integer value1, Integer value2) {
            addCriterion("param_index between", value1, value2, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andParamIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("param_index not between", value1, value2, "paramIndex");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIsNull() {
            addCriterion("rule_key is null");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIsNotNull() {
            addCriterion("rule_key is not null");
            return (Criteria) this;
        }

        public Criteria andRuleKeyEqualTo(Integer value) {
            addCriterion("rule_key =", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotEqualTo(Integer value) {
            addCriterion("rule_key <>", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyGreaterThan(Integer value) {
            addCriterion("rule_key >", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_key >=", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyLessThan(Integer value) {
            addCriterion("rule_key <", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyLessThanOrEqualTo(Integer value) {
            addCriterion("rule_key <=", value, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyIn(List<Integer> values) {
            addCriterion("rule_key in", values, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotIn(List<Integer> values) {
            addCriterion("rule_key not in", values, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyBetween(Integer value1, Integer value2) {
            addCriterion("rule_key between", value1, value2, "ruleKey");
            return (Criteria) this;
        }

        public Criteria andRuleKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_key not between", value1, value2, "ruleKey");
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