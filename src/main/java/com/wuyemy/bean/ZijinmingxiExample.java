package com.wuyemy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZijinmingxiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZijinmingxiExample() {
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

        public Criteria andZhanghaoIsNull() {
            addCriterion("zhanghao is null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIsNotNull() {
            addCriterion("zhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andZhanghaoEqualTo(String value) {
            addCriterion("zhanghao =", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotEqualTo(String value) {
            addCriterion("zhanghao <>", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThan(String value) {
            addCriterion("zhanghao >", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhanghao >=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThan(String value) {
            addCriterion("zhanghao <", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLessThanOrEqualTo(String value) {
            addCriterion("zhanghao <=", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoLike(String value) {
            addCriterion("zhanghao like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotLike(String value) {
            addCriterion("zhanghao not like", value, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoIn(List<String> values) {
            addCriterion("zhanghao in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotIn(List<String> values) {
            addCriterion("zhanghao not in", values, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoBetween(String value1, String value2) {
            addCriterion("zhanghao between", value1, value2, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andZhanghaoNotBetween(String value1, String value2) {
            addCriterion("zhanghao not between", value1, value2, "zhanghao");
            return (Criteria) this;
        }

        public Criteria andJinbileixingIsNull() {
            addCriterion("jinbileixing is null");
            return (Criteria) this;
        }

        public Criteria andJinbileixingIsNotNull() {
            addCriterion("jinbileixing is not null");
            return (Criteria) this;
        }

        public Criteria andJinbileixingEqualTo(Integer value) {
            addCriterion("jinbileixing =", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotEqualTo(Integer value) {
            addCriterion("jinbileixing <>", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingGreaterThan(Integer value) {
            addCriterion("jinbileixing >", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingGreaterThanOrEqualTo(Integer value) {
            addCriterion("jinbileixing >=", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingLessThan(Integer value) {
            addCriterion("jinbileixing <", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingLessThanOrEqualTo(Integer value) {
            addCriterion("jinbileixing <=", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingIn(List<Integer> values) {
            addCriterion("jinbileixing in", values, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotIn(List<Integer> values) {
            addCriterion("jinbileixing not in", values, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingBetween(Integer value1, Integer value2) {
            addCriterion("jinbileixing between", value1, value2, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotBetween(Integer value1, Integer value2) {
            addCriterion("jinbileixing not between", value1, value2, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andBiandonleixIsNull() {
            addCriterion("biandonleix is null");
            return (Criteria) this;
        }

        public Criteria andBiandonleixIsNotNull() {
            addCriterion("biandonleix is not null");
            return (Criteria) this;
        }

        public Criteria andBiandonleixEqualTo(Integer value) {
            addCriterion("biandonleix =", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixNotEqualTo(Integer value) {
            addCriterion("biandonleix <>", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixGreaterThan(Integer value) {
            addCriterion("biandonleix >", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixGreaterThanOrEqualTo(Integer value) {
            addCriterion("biandonleix >=", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixLessThan(Integer value) {
            addCriterion("biandonleix <", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixLessThanOrEqualTo(Integer value) {
            addCriterion("biandonleix <=", value, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixIn(List<Integer> values) {
            addCriterion("biandonleix in", values, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixNotIn(List<Integer> values) {
            addCriterion("biandonleix not in", values, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixBetween(Integer value1, Integer value2) {
            addCriterion("biandonleix between", value1, value2, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andBiandonleixNotBetween(Integer value1, Integer value2) {
            addCriterion("biandonleix not between", value1, value2, "biandonleix");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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