package com.performance.model;

import java.util.ArrayList;
import java.util.List;

public class TblGeneratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGeneratorExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Integer value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Integer value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Integer value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Integer value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Integer value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Integer> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Integer> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Integer value1, Integer value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Integer value1, Integer value2) {
            addCriterion("gid not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNull() {
            addCriterion("moduleId is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("moduleId is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(Integer value) {
            addCriterion("moduleId =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(Integer value) {
            addCriterion("moduleId <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(Integer value) {
            addCriterion("moduleId >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("moduleId >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(Integer value) {
            addCriterion("moduleId <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(Integer value) {
            addCriterion("moduleId <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<Integer> values) {
            addCriterion("moduleId in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<Integer> values) {
            addCriterion("moduleId not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(Integer value1, Integer value2) {
            addCriterion("moduleId between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(Integer value1, Integer value2) {
            addCriterion("moduleId not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModulenameIsNull() {
            addCriterion("moduleName is null");
            return (Criteria) this;
        }

        public Criteria andModulenameIsNotNull() {
            addCriterion("moduleName is not null");
            return (Criteria) this;
        }

        public Criteria andModulenameEqualTo(String value) {
            addCriterion("moduleName =", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotEqualTo(String value) {
            addCriterion("moduleName <>", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThan(String value) {
            addCriterion("moduleName >", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("moduleName >=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThan(String value) {
            addCriterion("moduleName <", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThanOrEqualTo(String value) {
            addCriterion("moduleName <=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLike(String value) {
            addCriterion("moduleName like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotLike(String value) {
            addCriterion("moduleName not like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameIn(List<String> values) {
            addCriterion("moduleName in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotIn(List<String> values) {
            addCriterion("moduleName not in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameBetween(String value1, String value2) {
            addCriterion("moduleName between", value1, value2, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotBetween(String value1, String value2) {
            addCriterion("moduleName not between", value1, value2, "modulename");
            return (Criteria) this;
        }

        public Criteria andStartorgIsNull() {
            addCriterion("startOrg is null");
            return (Criteria) this;
        }

        public Criteria andStartorgIsNotNull() {
            addCriterion("startOrg is not null");
            return (Criteria) this;
        }

        public Criteria andStartorgEqualTo(String value) {
            addCriterion("startOrg =", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgNotEqualTo(String value) {
            addCriterion("startOrg <>", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgGreaterThan(String value) {
            addCriterion("startOrg >", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgGreaterThanOrEqualTo(String value) {
            addCriterion("startOrg >=", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgLessThan(String value) {
            addCriterion("startOrg <", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgLessThanOrEqualTo(String value) {
            addCriterion("startOrg <=", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgLike(String value) {
            addCriterion("startOrg like", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgNotLike(String value) {
            addCriterion("startOrg not like", value, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgIn(List<String> values) {
            addCriterion("startOrg in", values, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgNotIn(List<String> values) {
            addCriterion("startOrg not in", values, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgBetween(String value1, String value2) {
            addCriterion("startOrg between", value1, value2, "startorg");
            return (Criteria) this;
        }

        public Criteria andStartorgNotBetween(String value1, String value2) {
            addCriterion("startOrg not between", value1, value2, "startorg");
            return (Criteria) this;
        }

        public Criteria andEndorgIsNull() {
            addCriterion("endOrg is null");
            return (Criteria) this;
        }

        public Criteria andEndorgIsNotNull() {
            addCriterion("endOrg is not null");
            return (Criteria) this;
        }

        public Criteria andEndorgEqualTo(String value) {
            addCriterion("endOrg =", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgNotEqualTo(String value) {
            addCriterion("endOrg <>", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgGreaterThan(String value) {
            addCriterion("endOrg >", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgGreaterThanOrEqualTo(String value) {
            addCriterion("endOrg >=", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgLessThan(String value) {
            addCriterion("endOrg <", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgLessThanOrEqualTo(String value) {
            addCriterion("endOrg <=", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgLike(String value) {
            addCriterion("endOrg like", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgNotLike(String value) {
            addCriterion("endOrg not like", value, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgIn(List<String> values) {
            addCriterion("endOrg in", values, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgNotIn(List<String> values) {
            addCriterion("endOrg not in", values, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgBetween(String value1, String value2) {
            addCriterion("endOrg between", value1, value2, "endorg");
            return (Criteria) this;
        }

        public Criteria andEndorgNotBetween(String value1, String value2) {
            addCriterion("endOrg not between", value1, value2, "endorg");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNull() {
            addCriterion("fileNum is null");
            return (Criteria) this;
        }

        public Criteria andFilenumIsNotNull() {
            addCriterion("fileNum is not null");
            return (Criteria) this;
        }

        public Criteria andFilenumEqualTo(Integer value) {
            addCriterion("fileNum =", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotEqualTo(Integer value) {
            addCriterion("fileNum <>", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThan(Integer value) {
            addCriterion("fileNum >", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileNum >=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThan(Integer value) {
            addCriterion("fileNum <", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumLessThanOrEqualTo(Integer value) {
            addCriterion("fileNum <=", value, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumIn(List<Integer> values) {
            addCriterion("fileNum in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotIn(List<Integer> values) {
            addCriterion("fileNum not in", values, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumBetween(Integer value1, Integer value2) {
            addCriterion("fileNum between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilenumNotBetween(Integer value1, Integer value2) {
            addCriterion("fileNum not between", value1, value2, "filenum");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Integer value) {
            addCriterion("fileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Integer value) {
            addCriterion("fileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Integer value) {
            addCriterion("fileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Integer value) {
            addCriterion("fileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Integer value) {
            addCriterion("fileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Integer> values) {
            addCriterion("fileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Integer> values) {
            addCriterion("fileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Integer value1, Integer value2) {
            addCriterion("fileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("fileSize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilebasepathIsNull() {
            addCriterion("fileBasePath is null");
            return (Criteria) this;
        }

        public Criteria andFilebasepathIsNotNull() {
            addCriterion("fileBasePath is not null");
            return (Criteria) this;
        }

        public Criteria andFilebasepathEqualTo(String value) {
            addCriterion("fileBasePath =", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathNotEqualTo(String value) {
            addCriterion("fileBasePath <>", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathGreaterThan(String value) {
            addCriterion("fileBasePath >", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathGreaterThanOrEqualTo(String value) {
            addCriterion("fileBasePath >=", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathLessThan(String value) {
            addCriterion("fileBasePath <", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathLessThanOrEqualTo(String value) {
            addCriterion("fileBasePath <=", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathLike(String value) {
            addCriterion("fileBasePath like", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathNotLike(String value) {
            addCriterion("fileBasePath not like", value, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathIn(List<String> values) {
            addCriterion("fileBasePath in", values, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathNotIn(List<String> values) {
            addCriterion("fileBasePath not in", values, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathBetween(String value1, String value2) {
            addCriterion("fileBasePath between", value1, value2, "filebasepath");
            return (Criteria) this;
        }

        public Criteria andFilebasepathNotBetween(String value1, String value2) {
            addCriterion("fileBasePath not between", value1, value2, "filebasepath");
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