package com.wuyemy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YyzxsqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YyzxsqExample() {
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

        public Criteria andSqzhanghaoIsNull() {
            addCriterion("sqzhanghao is null");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoIsNotNull() {
            addCriterion("sqzhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoEqualTo(String value) {
            addCriterion("sqzhanghao =", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoNotEqualTo(String value) {
            addCriterion("sqzhanghao <>", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoGreaterThan(String value) {
            addCriterion("sqzhanghao >", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("sqzhanghao >=", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoLessThan(String value) {
            addCriterion("sqzhanghao <", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("sqzhanghao <=", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoLike(String value) {
            addCriterion("sqzhanghao like", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoNotLike(String value) {
            addCriterion("sqzhanghao not like", value, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoIn(List<String> values) {
            addCriterion("sqzhanghao in", values, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoNotIn(List<String> values) {
            addCriterion("sqzhanghao not in", values, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoBetween(String value1, String value2) {
            addCriterion("sqzhanghao between", value1, value2, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqzhanghaoNotBetween(String value1, String value2) {
            addCriterion("sqzhanghao not between", value1, value2, "sqzhanghao");
            return (Criteria) this;
        }

        public Criteria andSqnameIsNull() {
            addCriterion("sqname is null");
            return (Criteria) this;
        }

        public Criteria andSqnameIsNotNull() {
            addCriterion("sqname is not null");
            return (Criteria) this;
        }

        public Criteria andSqnameEqualTo(String value) {
            addCriterion("sqname =", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameNotEqualTo(String value) {
            addCriterion("sqname <>", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameGreaterThan(String value) {
            addCriterion("sqname >", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameGreaterThanOrEqualTo(String value) {
            addCriterion("sqname >=", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameLessThan(String value) {
            addCriterion("sqname <", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameLessThanOrEqualTo(String value) {
            addCriterion("sqname <=", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameLike(String value) {
            addCriterion("sqname like", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameNotLike(String value) {
            addCriterion("sqname not like", value, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameIn(List<String> values) {
            addCriterion("sqname in", values, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameNotIn(List<String> values) {
            addCriterion("sqname not in", values, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameBetween(String value1, String value2) {
            addCriterion("sqname between", value1, value2, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqnameNotBetween(String value1, String value2) {
            addCriterion("sqname not between", value1, value2, "sqname");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaIsNull() {
            addCriterion("sqdianhua is null");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaIsNotNull() {
            addCriterion("sqdianhua is not null");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaEqualTo(String value) {
            addCriterion("sqdianhua =", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaNotEqualTo(String value) {
            addCriterion("sqdianhua <>", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaGreaterThan(String value) {
            addCriterion("sqdianhua >", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("sqdianhua >=", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaLessThan(String value) {
            addCriterion("sqdianhua <", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaLessThanOrEqualTo(String value) {
            addCriterion("sqdianhua <=", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaLike(String value) {
            addCriterion("sqdianhua like", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaNotLike(String value) {
            addCriterion("sqdianhua not like", value, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaIn(List<String> values) {
            addCriterion("sqdianhua in", values, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaNotIn(List<String> values) {
            addCriterion("sqdianhua not in", values, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaBetween(String value1, String value2) {
            addCriterion("sqdianhua between", value1, value2, "sqdianhua");
            return (Criteria) this;
        }

        public Criteria andSqdianhuaNotBetween(String value1, String value2) {
            addCriterion("sqdianhua not between", value1, value2, "sqdianhua");
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

        public Criteria andSqtimeIsNull() {
            addCriterion("sqtime is null");
            return (Criteria) this;
        }

        public Criteria andSqtimeIsNotNull() {
            addCriterion("sqtime is not null");
            return (Criteria) this;
        }

        public Criteria andSqtimeEqualTo(Date value) {
            addCriterion("sqtime =", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeNotEqualTo(Date value) {
            addCriterion("sqtime <>", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeGreaterThan(Date value) {
            addCriterion("sqtime >", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sqtime >=", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeLessThan(Date value) {
            addCriterion("sqtime <", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeLessThanOrEqualTo(Date value) {
            addCriterion("sqtime <=", value, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeIn(List<Date> values) {
            addCriterion("sqtime in", values, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeNotIn(List<Date> values) {
            addCriterion("sqtime not in", values, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeBetween(Date value1, Date value2) {
            addCriterion("sqtime between", value1, value2, "sqtime");
            return (Criteria) this;
        }

        public Criteria andSqtimeNotBetween(Date value1, Date value2) {
            addCriterion("sqtime not between", value1, value2, "sqtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeIsNull() {
            addCriterion("tgtime is null");
            return (Criteria) this;
        }

        public Criteria andTgtimeIsNotNull() {
            addCriterion("tgtime is not null");
            return (Criteria) this;
        }

        public Criteria andTgtimeEqualTo(Date value) {
            addCriterion("tgtime =", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeNotEqualTo(Date value) {
            addCriterion("tgtime <>", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeGreaterThan(Date value) {
            addCriterion("tgtime >", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tgtime >=", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeLessThan(Date value) {
            addCriterion("tgtime <", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeLessThanOrEqualTo(Date value) {
            addCriterion("tgtime <=", value, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeIn(List<Date> values) {
            addCriterion("tgtime in", values, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeNotIn(List<Date> values) {
            addCriterion("tgtime not in", values, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeBetween(Date value1, Date value2) {
            addCriterion("tgtime between", value1, value2, "tgtime");
            return (Criteria) this;
        }

        public Criteria andTgtimeNotBetween(Date value1, Date value2) {
            addCriterion("tgtime not between", value1, value2, "tgtime");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidIsNull() {
            addCriterion("zhaungtaiid is null");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidIsNotNull() {
            addCriterion("zhaungtaiid is not null");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidEqualTo(Integer value) {
            addCriterion("zhaungtaiid =", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidNotEqualTo(Integer value) {
            addCriterion("zhaungtaiid <>", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidGreaterThan(Integer value) {
            addCriterion("zhaungtaiid >", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaungtaiid >=", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidLessThan(Integer value) {
            addCriterion("zhaungtaiid <", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidLessThanOrEqualTo(Integer value) {
            addCriterion("zhaungtaiid <=", value, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidIn(List<Integer> values) {
            addCriterion("zhaungtaiid in", values, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidNotIn(List<Integer> values) {
            addCriterion("zhaungtaiid not in", values, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidBetween(Integer value1, Integer value2) {
            addCriterion("zhaungtaiid between", value1, value2, "zhaungtaiid");
            return (Criteria) this;
        }

        public Criteria andZhaungtaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("zhaungtaiid not between", value1, value2, "zhaungtaiid");
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