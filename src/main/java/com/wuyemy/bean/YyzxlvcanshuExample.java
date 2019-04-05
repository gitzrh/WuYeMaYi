package com.wuyemy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YyzxlvcanshuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyzxlvcanshuExample() {
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

        public Criteria andLvnameIsNull() {
            addCriterion("lvname is null");
            return (Criteria) this;
        }

        public Criteria andLvnameIsNotNull() {
            addCriterion("lvname is not null");
            return (Criteria) this;
        }

        public Criteria andLvnameEqualTo(String value) {
            addCriterion("lvname =", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameNotEqualTo(String value) {
            addCriterion("lvname <>", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameGreaterThan(String value) {
            addCriterion("lvname >", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameGreaterThanOrEqualTo(String value) {
            addCriterion("lvname >=", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameLessThan(String value) {
            addCriterion("lvname <", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameLessThanOrEqualTo(String value) {
            addCriterion("lvname <=", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameLike(String value) {
            addCriterion("lvname like", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameNotLike(String value) {
            addCriterion("lvname not like", value, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameIn(List<String> values) {
            addCriterion("lvname in", values, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameNotIn(List<String> values) {
            addCriterion("lvname not in", values, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameBetween(String value1, String value2) {
            addCriterion("lvname between", value1, value2, "lvname");
            return (Criteria) this;
        }

        public Criteria andLvnameNotBetween(String value1, String value2) {
            addCriterion("lvname not between", value1, value2, "lvname");
            return (Criteria) this;
        }

        public Criteria andFulijinIsNull() {
            addCriterion("fulijin is null");
            return (Criteria) this;
        }

        public Criteria andFulijinIsNotNull() {
            addCriterion("fulijin is not null");
            return (Criteria) this;
        }

        public Criteria andFulijinEqualTo(Integer value) {
            addCriterion("fulijin =", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinNotEqualTo(Integer value) {
            addCriterion("fulijin <>", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinGreaterThan(Integer value) {
            addCriterion("fulijin >", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinGreaterThanOrEqualTo(Integer value) {
            addCriterion("fulijin >=", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinLessThan(Integer value) {
            addCriterion("fulijin <", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinLessThanOrEqualTo(Integer value) {
            addCriterion("fulijin <=", value, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinIn(List<Integer> values) {
            addCriterion("fulijin in", values, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinNotIn(List<Integer> values) {
            addCriterion("fulijin not in", values, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinBetween(Integer value1, Integer value2) {
            addCriterion("fulijin between", value1, value2, "fulijin");
            return (Criteria) this;
        }

        public Criteria andFulijinNotBetween(Integer value1, Integer value2) {
            addCriterion("fulijin not between", value1, value2, "fulijin");
            return (Criteria) this;
        }

        public Criteria andZongnumIsNull() {
            addCriterion("zongnum is null");
            return (Criteria) this;
        }

        public Criteria andZongnumIsNotNull() {
            addCriterion("zongnum is not null");
            return (Criteria) this;
        }

        public Criteria andZongnumEqualTo(Integer value) {
            addCriterion("zongnum =", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumNotEqualTo(Integer value) {
            addCriterion("zongnum <>", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumGreaterThan(Integer value) {
            addCriterion("zongnum >", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zongnum >=", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumLessThan(Integer value) {
            addCriterion("zongnum <", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumLessThanOrEqualTo(Integer value) {
            addCriterion("zongnum <=", value, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumIn(List<Integer> values) {
            addCriterion("zongnum in", values, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumNotIn(List<Integer> values) {
            addCriterion("zongnum not in", values, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumBetween(Integer value1, Integer value2) {
            addCriterion("zongnum between", value1, value2, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZongnumNotBetween(Integer value1, Integer value2) {
            addCriterion("zongnum not between", value1, value2, "zongnum");
            return (Criteria) this;
        }

        public Criteria andZhituinumIsNull() {
            addCriterion("zhituinum is null");
            return (Criteria) this;
        }

        public Criteria andZhituinumIsNotNull() {
            addCriterion("zhituinum is not null");
            return (Criteria) this;
        }

        public Criteria andZhituinumEqualTo(Integer value) {
            addCriterion("zhituinum =", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumNotEqualTo(Integer value) {
            addCriterion("zhituinum <>", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumGreaterThan(Integer value) {
            addCriterion("zhituinum >", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhituinum >=", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumLessThan(Integer value) {
            addCriterion("zhituinum <", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumLessThanOrEqualTo(Integer value) {
            addCriterion("zhituinum <=", value, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumIn(List<Integer> values) {
            addCriterion("zhituinum in", values, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumNotIn(List<Integer> values) {
            addCriterion("zhituinum not in", values, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumBetween(Integer value1, Integer value2) {
            addCriterion("zhituinum between", value1, value2, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhituinumNotBetween(Integer value1, Integer value2) {
            addCriterion("zhituinum not between", value1, value2, "zhituinum");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliIsNull() {
            addCriterion("zhekoubili is null");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliIsNotNull() {
            addCriterion("zhekoubili is not null");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliEqualTo(BigDecimal value) {
            addCriterion("zhekoubili =", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliNotEqualTo(BigDecimal value) {
            addCriterion("zhekoubili <>", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliGreaterThan(BigDecimal value) {
            addCriterion("zhekoubili >", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zhekoubili >=", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliLessThan(BigDecimal value) {
            addCriterion("zhekoubili <", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zhekoubili <=", value, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliIn(List<BigDecimal> values) {
            addCriterion("zhekoubili in", values, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliNotIn(List<BigDecimal> values) {
            addCriterion("zhekoubili not in", values, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhekoubili between", value1, value2, "zhekoubili");
            return (Criteria) this;
        }

        public Criteria andZhekoubiliNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zhekoubili not between", value1, value2, "zhekoubili");
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