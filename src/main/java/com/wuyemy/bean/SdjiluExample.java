package com.wuyemy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SdjiluExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SdjiluExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLianhuaIsNull() {
            addCriterion("lianhua is null");
            return (Criteria) this;
        }

        public Criteria andLianhuaIsNotNull() {
            addCriterion("lianhua is not null");
            return (Criteria) this;
        }

        public Criteria andLianhuaEqualTo(String value) {
            addCriterion("lianhua =", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaNotEqualTo(String value) {
            addCriterion("lianhua <>", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaGreaterThan(String value) {
            addCriterion("lianhua >", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("lianhua >=", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaLessThan(String value) {
            addCriterion("lianhua <", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaLessThanOrEqualTo(String value) {
            addCriterion("lianhua <=", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaLike(String value) {
            addCriterion("lianhua like", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaNotLike(String value) {
            addCriterion("lianhua not like", value, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaIn(List<String> values) {
            addCriterion("lianhua in", values, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaNotIn(List<String> values) {
            addCriterion("lianhua not in", values, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaBetween(String value1, String value2) {
            addCriterion("lianhua between", value1, value2, "lianhua");
            return (Criteria) this;
        }

        public Criteria andLianhuaNotBetween(String value1, String value2) {
            addCriterion("lianhua not between", value1, value2, "lianhua");
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

        public Criteria andBiandonglxIsNull() {
            addCriterion("biandonglx is null");
            return (Criteria) this;
        }

        public Criteria andBiandonglxIsNotNull() {
            addCriterion("biandonglx is not null");
            return (Criteria) this;
        }

        public Criteria andBiandonglxEqualTo(Integer value) {
            addCriterion("biandonglx =", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxNotEqualTo(Integer value) {
            addCriterion("biandonglx <>", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxGreaterThan(Integer value) {
            addCriterion("biandonglx >", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxGreaterThanOrEqualTo(Integer value) {
            addCriterion("biandonglx >=", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxLessThan(Integer value) {
            addCriterion("biandonglx <", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxLessThanOrEqualTo(Integer value) {
            addCriterion("biandonglx <=", value, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxIn(List<Integer> values) {
            addCriterion("biandonglx in", values, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxNotIn(List<Integer> values) {
            addCriterion("biandonglx not in", values, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxBetween(Integer value1, Integer value2) {
            addCriterion("biandonglx between", value1, value2, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandonglxNotBetween(Integer value1, Integer value2) {
            addCriterion("biandonglx not between", value1, value2, "biandonglx");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeIsNull() {
            addCriterion("biandongtime is null");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeIsNotNull() {
            addCriterion("biandongtime is not null");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeEqualTo(Date value) {
            addCriterion("biandongtime =", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeNotEqualTo(Date value) {
            addCriterion("biandongtime <>", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeGreaterThan(Date value) {
            addCriterion("biandongtime >", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("biandongtime >=", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeLessThan(Date value) {
            addCriterion("biandongtime <", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeLessThanOrEqualTo(Date value) {
            addCriterion("biandongtime <=", value, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeIn(List<Date> values) {
            addCriterion("biandongtime in", values, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeNotIn(List<Date> values) {
            addCriterion("biandongtime not in", values, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeBetween(Date value1, Date value2) {
            addCriterion("biandongtime between", value1, value2, "biandongtime");
            return (Criteria) this;
        }

        public Criteria andBiandongtimeNotBetween(Date value1, Date value2) {
            addCriterion("biandongtime not between", value1, value2, "biandongtime");
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