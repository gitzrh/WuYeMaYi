package com.wuyemy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YyzxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyzxExample() {
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

        public Criteria andYyzxidIsNull() {
            addCriterion("yyzxid is null");
            return (Criteria) this;
        }

        public Criteria andYyzxidIsNotNull() {
            addCriterion("yyzxid is not null");
            return (Criteria) this;
        }

        public Criteria andYyzxidEqualTo(Integer value) {
            addCriterion("yyzxid =", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotEqualTo(Integer value) {
            addCriterion("yyzxid <>", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidGreaterThan(Integer value) {
            addCriterion("yyzxid >", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yyzxid >=", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidLessThan(Integer value) {
            addCriterion("yyzxid <", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidLessThanOrEqualTo(Integer value) {
            addCriterion("yyzxid <=", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidIn(List<Integer> values) {
            addCriterion("yyzxid in", values, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotIn(List<Integer> values) {
            addCriterion("yyzxid not in", values, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidBetween(Integer value1, Integer value2) {
            addCriterion("yyzxid between", value1, value2, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotBetween(Integer value1, Integer value2) {
            addCriterion("yyzxid not between", value1, value2, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoIsNull() {
            addCriterion("yyzhanghao is null");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoIsNotNull() {
            addCriterion("yyzhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoEqualTo(String value) {
            addCriterion("yyzhanghao =", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoNotEqualTo(String value) {
            addCriterion("yyzhanghao <>", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoGreaterThan(String value) {
            addCriterion("yyzhanghao >", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("yyzhanghao >=", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoLessThan(String value) {
            addCriterion("yyzhanghao <", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("yyzhanghao <=", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoLike(String value) {
            addCriterion("yyzhanghao like", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoNotLike(String value) {
            addCriterion("yyzhanghao not like", value, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoIn(List<String> values) {
            addCriterion("yyzhanghao in", values, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoNotIn(List<String> values) {
            addCriterion("yyzhanghao not in", values, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoBetween(String value1, String value2) {
            addCriterion("yyzhanghao between", value1, value2, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYyzhanghaoNotBetween(String value1, String value2) {
            addCriterion("yyzhanghao not between", value1, value2, "yyzhanghao");
            return (Criteria) this;
        }

        public Criteria andYynameIsNull() {
            addCriterion("yyname is null");
            return (Criteria) this;
        }

        public Criteria andYynameIsNotNull() {
            addCriterion("yyname is not null");
            return (Criteria) this;
        }

        public Criteria andYynameEqualTo(String value) {
            addCriterion("yyname =", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotEqualTo(String value) {
            addCriterion("yyname <>", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameGreaterThan(String value) {
            addCriterion("yyname >", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameGreaterThanOrEqualTo(String value) {
            addCriterion("yyname >=", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLessThan(String value) {
            addCriterion("yyname <", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLessThanOrEqualTo(String value) {
            addCriterion("yyname <=", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameLike(String value) {
            addCriterion("yyname like", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotLike(String value) {
            addCriterion("yyname not like", value, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameIn(List<String> values) {
            addCriterion("yyname in", values, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotIn(List<String> values) {
            addCriterion("yyname not in", values, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameBetween(String value1, String value2) {
            addCriterion("yyname between", value1, value2, "yyname");
            return (Criteria) this;
        }

        public Criteria andYynameNotBetween(String value1, String value2) {
            addCriterion("yyname not between", value1, value2, "yyname");
            return (Criteria) this;
        }

        public Criteria andYybianhaoIsNull() {
            addCriterion("yybianhao is null");
            return (Criteria) this;
        }

        public Criteria andYybianhaoIsNotNull() {
            addCriterion("yybianhao is not null");
            return (Criteria) this;
        }

        public Criteria andYybianhaoEqualTo(String value) {
            addCriterion("yybianhao =", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoNotEqualTo(String value) {
            addCriterion("yybianhao <>", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoGreaterThan(String value) {
            addCriterion("yybianhao >", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("yybianhao >=", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoLessThan(String value) {
            addCriterion("yybianhao <", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoLessThanOrEqualTo(String value) {
            addCriterion("yybianhao <=", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoLike(String value) {
            addCriterion("yybianhao like", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoNotLike(String value) {
            addCriterion("yybianhao not like", value, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoIn(List<String> values) {
            addCriterion("yybianhao in", values, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoNotIn(List<String> values) {
            addCriterion("yybianhao not in", values, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoBetween(String value1, String value2) {
            addCriterion("yybianhao between", value1, value2, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYybianhaoNotBetween(String value1, String value2) {
            addCriterion("yybianhao not between", value1, value2, "yybianhao");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidIsNull() {
            addCriterion("yyzxlvid is null");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidIsNotNull() {
            addCriterion("yyzxlvid is not null");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidEqualTo(Integer value) {
            addCriterion("yyzxlvid =", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidNotEqualTo(Integer value) {
            addCriterion("yyzxlvid <>", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidGreaterThan(Integer value) {
            addCriterion("yyzxlvid >", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yyzxlvid >=", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidLessThan(Integer value) {
            addCriterion("yyzxlvid <", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidLessThanOrEqualTo(Integer value) {
            addCriterion("yyzxlvid <=", value, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidIn(List<Integer> values) {
            addCriterion("yyzxlvid in", values, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidNotIn(List<Integer> values) {
            addCriterion("yyzxlvid not in", values, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidBetween(Integer value1, Integer value2) {
            addCriterion("yyzxlvid between", value1, value2, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyzxlvidNotBetween(Integer value1, Integer value2) {
            addCriterion("yyzxlvid not between", value1, value2, "yyzxlvid");
            return (Criteria) this;
        }

        public Criteria andYyjinbiIsNull() {
            addCriterion("yyjinbi is null");
            return (Criteria) this;
        }

        public Criteria andYyjinbiIsNotNull() {
            addCriterion("yyjinbi is not null");
            return (Criteria) this;
        }

        public Criteria andYyjinbiEqualTo(BigDecimal value) {
            addCriterion("yyjinbi =", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiNotEqualTo(BigDecimal value) {
            addCriterion("yyjinbi <>", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiGreaterThan(BigDecimal value) {
            addCriterion("yyjinbi >", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yyjinbi >=", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiLessThan(BigDecimal value) {
            addCriterion("yyjinbi <", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yyjinbi <=", value, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiIn(List<BigDecimal> values) {
            addCriterion("yyjinbi in", values, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiNotIn(List<BigDecimal> values) {
            addCriterion("yyjinbi not in", values, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yyjinbi between", value1, value2, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYyjinbiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yyjinbi not between", value1, value2, "yyjinbi");
            return (Criteria) this;
        }

        public Criteria andYynumIsNull() {
            addCriterion("yynum is null");
            return (Criteria) this;
        }

        public Criteria andYynumIsNotNull() {
            addCriterion("yynum is not null");
            return (Criteria) this;
        }

        public Criteria andYynumEqualTo(Integer value) {
            addCriterion("yynum =", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumNotEqualTo(Integer value) {
            addCriterion("yynum <>", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumGreaterThan(Integer value) {
            addCriterion("yynum >", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumGreaterThanOrEqualTo(Integer value) {
            addCriterion("yynum >=", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumLessThan(Integer value) {
            addCriterion("yynum <", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumLessThanOrEqualTo(Integer value) {
            addCriterion("yynum <=", value, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumIn(List<Integer> values) {
            addCriterion("yynum in", values, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumNotIn(List<Integer> values) {
            addCriterion("yynum not in", values, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumBetween(Integer value1, Integer value2) {
            addCriterion("yynum between", value1, value2, "yynum");
            return (Criteria) this;
        }

        public Criteria andYynumNotBetween(Integer value1, Integer value2) {
            addCriterion("yynum not between", value1, value2, "yynum");
            return (Criteria) this;
        }

        public Criteria andZtnumIsNull() {
            addCriterion("ztnum is null");
            return (Criteria) this;
        }

        public Criteria andZtnumIsNotNull() {
            addCriterion("ztnum is not null");
            return (Criteria) this;
        }

        public Criteria andZtnumEqualTo(Integer value) {
            addCriterion("ztnum =", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumNotEqualTo(Integer value) {
            addCriterion("ztnum <>", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumGreaterThan(Integer value) {
            addCriterion("ztnum >", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ztnum >=", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumLessThan(Integer value) {
            addCriterion("ztnum <", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumLessThanOrEqualTo(Integer value) {
            addCriterion("ztnum <=", value, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumIn(List<Integer> values) {
            addCriterion("ztnum in", values, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumNotIn(List<Integer> values) {
            addCriterion("ztnum not in", values, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumBetween(Integer value1, Integer value2) {
            addCriterion("ztnum between", value1, value2, "ztnum");
            return (Criteria) this;
        }

        public Criteria andZtnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ztnum not between", value1, value2, "ztnum");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNull() {
            addCriterion("dizhi is null");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNotNull() {
            addCriterion("dizhi is not null");
            return (Criteria) this;
        }

        public Criteria andDizhiEqualTo(String value) {
            addCriterion("dizhi =", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotEqualTo(String value) {
            addCriterion("dizhi <>", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThan(String value) {
            addCriterion("dizhi >", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThanOrEqualTo(String value) {
            addCriterion("dizhi >=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThan(String value) {
            addCriterion("dizhi <", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThanOrEqualTo(String value) {
            addCriterion("dizhi <=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLike(String value) {
            addCriterion("dizhi like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotLike(String value) {
            addCriterion("dizhi not like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiIn(List<String> values) {
            addCriterion("dizhi in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotIn(List<String> values) {
            addCriterion("dizhi not in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiBetween(String value1, String value2) {
            addCriterion("dizhi between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotBetween(String value1, String value2) {
            addCriterion("dizhi not between", value1, value2, "dizhi");
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