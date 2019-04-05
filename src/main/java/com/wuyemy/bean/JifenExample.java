package com.wuyemy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JifenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JifenExample() {
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

        public Criteria andJifenidIsNull() {
            addCriterion("jifenid is null");
            return (Criteria) this;
        }

        public Criteria andJifenidIsNotNull() {
            addCriterion("jifenid is not null");
            return (Criteria) this;
        }

        public Criteria andJifenidEqualTo(Integer value) {
            addCriterion("jifenid =", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidNotEqualTo(Integer value) {
            addCriterion("jifenid <>", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidGreaterThan(Integer value) {
            addCriterion("jifenid >", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jifenid >=", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidLessThan(Integer value) {
            addCriterion("jifenid <", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidLessThanOrEqualTo(Integer value) {
            addCriterion("jifenid <=", value, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidIn(List<Integer> values) {
            addCriterion("jifenid in", values, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidNotIn(List<Integer> values) {
            addCriterion("jifenid not in", values, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidBetween(Integer value1, Integer value2) {
            addCriterion("jifenid between", value1, value2, "jifenid");
            return (Criteria) this;
        }

        public Criteria andJifenidNotBetween(Integer value1, Integer value2) {
            addCriterion("jifenid not between", value1, value2, "jifenid");
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

        public Criteria andFxjfIsNull() {
            addCriterion("fxjf is null");
            return (Criteria) this;
        }

        public Criteria andFxjfIsNotNull() {
            addCriterion("fxjf is not null");
            return (Criteria) this;
        }

        public Criteria andFxjfEqualTo(BigDecimal value) {
            addCriterion("fxjf =", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfNotEqualTo(BigDecimal value) {
            addCriterion("fxjf <>", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfGreaterThan(BigDecimal value) {
            addCriterion("fxjf >", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fxjf >=", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfLessThan(BigDecimal value) {
            addCriterion("fxjf <", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fxjf <=", value, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfIn(List<BigDecimal> values) {
            addCriterion("fxjf in", values, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfNotIn(List<BigDecimal> values) {
            addCriterion("fxjf not in", values, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fxjf between", value1, value2, "fxjf");
            return (Criteria) this;
        }

        public Criteria andFxjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fxjf not between", value1, value2, "fxjf");
            return (Criteria) this;
        }

        public Criteria andGcjfIsNull() {
            addCriterion("gcjf is null");
            return (Criteria) this;
        }

        public Criteria andGcjfIsNotNull() {
            addCriterion("gcjf is not null");
            return (Criteria) this;
        }

        public Criteria andGcjfEqualTo(BigDecimal value) {
            addCriterion("gcjf =", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfNotEqualTo(BigDecimal value) {
            addCriterion("gcjf <>", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfGreaterThan(BigDecimal value) {
            addCriterion("gcjf >", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gcjf >=", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfLessThan(BigDecimal value) {
            addCriterion("gcjf <", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gcjf <=", value, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfIn(List<BigDecimal> values) {
            addCriterion("gcjf in", values, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfNotIn(List<BigDecimal> values) {
            addCriterion("gcjf not in", values, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gcjf between", value1, value2, "gcjf");
            return (Criteria) this;
        }

        public Criteria andGcjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gcjf not between", value1, value2, "gcjf");
            return (Criteria) this;
        }

        public Criteria andZtjfIsNull() {
            addCriterion("ztjf is null");
            return (Criteria) this;
        }

        public Criteria andZtjfIsNotNull() {
            addCriterion("ztjf is not null");
            return (Criteria) this;
        }

        public Criteria andZtjfEqualTo(BigDecimal value) {
            addCriterion("ztjf =", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfNotEqualTo(BigDecimal value) {
            addCriterion("ztjf <>", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfGreaterThan(BigDecimal value) {
            addCriterion("ztjf >", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ztjf >=", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfLessThan(BigDecimal value) {
            addCriterion("ztjf <", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ztjf <=", value, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfIn(List<BigDecimal> values) {
            addCriterion("ztjf in", values, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfNotIn(List<BigDecimal> values) {
            addCriterion("ztjf not in", values, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ztjf between", value1, value2, "ztjf");
            return (Criteria) this;
        }

        public Criteria andZtjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ztjf not between", value1, value2, "ztjf");
            return (Criteria) this;
        }

        public Criteria andChjfIsNull() {
            addCriterion("chjf is null");
            return (Criteria) this;
        }

        public Criteria andChjfIsNotNull() {
            addCriterion("chjf is not null");
            return (Criteria) this;
        }

        public Criteria andChjfEqualTo(BigDecimal value) {
            addCriterion("chjf =", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfNotEqualTo(BigDecimal value) {
            addCriterion("chjf <>", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfGreaterThan(BigDecimal value) {
            addCriterion("chjf >", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("chjf >=", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfLessThan(BigDecimal value) {
            addCriterion("chjf <", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("chjf <=", value, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfIn(List<BigDecimal> values) {
            addCriterion("chjf in", values, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfNotIn(List<BigDecimal> values) {
            addCriterion("chjf not in", values, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chjf between", value1, value2, "chjf");
            return (Criteria) this;
        }

        public Criteria andChjfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("chjf not between", value1, value2, "chjf");
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