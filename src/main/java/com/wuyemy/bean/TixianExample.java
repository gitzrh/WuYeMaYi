package com.wuyemy.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TixianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TixianExample() {
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

        public Criteria andJinbileixingEqualTo(String value) {
            addCriterion("jinbileixing =", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotEqualTo(String value) {
            addCriterion("jinbileixing <>", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingGreaterThan(String value) {
            addCriterion("jinbileixing >", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingGreaterThanOrEqualTo(String value) {
            addCriterion("jinbileixing >=", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingLessThan(String value) {
            addCriterion("jinbileixing <", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingLessThanOrEqualTo(String value) {
            addCriterion("jinbileixing <=", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingLike(String value) {
            addCriterion("jinbileixing like", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotLike(String value) {
            addCriterion("jinbileixing not like", value, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingIn(List<String> values) {
            addCriterion("jinbileixing in", values, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotIn(List<String> values) {
            addCriterion("jinbileixing not in", values, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingBetween(String value1, String value2) {
            addCriterion("jinbileixing between", value1, value2, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andJinbileixingNotBetween(String value1, String value2) {
            addCriterion("jinbileixing not between", value1, value2, "jinbileixing");
            return (Criteria) this;
        }

        public Criteria andTxjibiIsNull() {
            addCriterion("txjibi is null");
            return (Criteria) this;
        }

        public Criteria andTxjibiIsNotNull() {
            addCriterion("txjibi is not null");
            return (Criteria) this;
        }

        public Criteria andTxjibiEqualTo(BigDecimal value) {
            addCriterion("txjibi =", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiNotEqualTo(BigDecimal value) {
            addCriterion("txjibi <>", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiGreaterThan(BigDecimal value) {
            addCriterion("txjibi >", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("txjibi >=", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiLessThan(BigDecimal value) {
            addCriterion("txjibi <", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("txjibi <=", value, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiIn(List<BigDecimal> values) {
            addCriterion("txjibi in", values, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiNotIn(List<BigDecimal> values) {
            addCriterion("txjibi not in", values, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txjibi between", value1, value2, "txjibi");
            return (Criteria) this;
        }

        public Criteria andTxjibiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("txjibi not between", value1, value2, "txjibi");
            return (Criteria) this;
        }

        public Criteria andShouxufeiIsNull() {
            addCriterion("shouxufei is null");
            return (Criteria) this;
        }

        public Criteria andShouxufeiIsNotNull() {
            addCriterion("shouxufei is not null");
            return (Criteria) this;
        }

        public Criteria andShouxufeiEqualTo(BigDecimal value) {
            addCriterion("shouxufei =", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiNotEqualTo(BigDecimal value) {
            addCriterion("shouxufei <>", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiGreaterThan(BigDecimal value) {
            addCriterion("shouxufei >", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shouxufei >=", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiLessThan(BigDecimal value) {
            addCriterion("shouxufei <", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shouxufei <=", value, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiIn(List<BigDecimal> values) {
            addCriterion("shouxufei in", values, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiNotIn(List<BigDecimal> values) {
            addCriterion("shouxufei not in", values, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shouxufei between", value1, value2, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShouxufeiNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shouxufei not between", value1, value2, "shouxufei");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangIsNull() {
            addCriterion("shijidaozhang is null");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangIsNotNull() {
            addCriterion("shijidaozhang is not null");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangEqualTo(BigDecimal value) {
            addCriterion("shijidaozhang =", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangNotEqualTo(BigDecimal value) {
            addCriterion("shijidaozhang <>", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangGreaterThan(BigDecimal value) {
            addCriterion("shijidaozhang >", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shijidaozhang >=", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangLessThan(BigDecimal value) {
            addCriterion("shijidaozhang <", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shijidaozhang <=", value, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangIn(List<BigDecimal> values) {
            addCriterion("shijidaozhang in", values, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangNotIn(List<BigDecimal> values) {
            addCriterion("shijidaozhang not in", values, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shijidaozhang between", value1, value2, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andShijidaozhangNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shijidaozhang not between", value1, value2, "shijidaozhang");
            return (Criteria) this;
        }

        public Criteria andTixiantimeIsNull() {
            addCriterion("tixiantime is null");
            return (Criteria) this;
        }

        public Criteria andTixiantimeIsNotNull() {
            addCriterion("tixiantime is not null");
            return (Criteria) this;
        }

        public Criteria andTixiantimeEqualTo(Date value) {
            addCriterion("tixiantime =", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeNotEqualTo(Date value) {
            addCriterion("tixiantime <>", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeGreaterThan(Date value) {
            addCriterion("tixiantime >", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tixiantime >=", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeLessThan(Date value) {
            addCriterion("tixiantime <", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeLessThanOrEqualTo(Date value) {
            addCriterion("tixiantime <=", value, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeIn(List<Date> values) {
            addCriterion("tixiantime in", values, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeNotIn(List<Date> values) {
            addCriterion("tixiantime not in", values, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeBetween(Date value1, Date value2) {
            addCriterion("tixiantime between", value1, value2, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andTixiantimeNotBetween(Date value1, Date value2) {
            addCriterion("tixiantime not between", value1, value2, "tixiantime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeIsNull() {
            addCriterion("jujuetime is null");
            return (Criteria) this;
        }

        public Criteria andJujuetimeIsNotNull() {
            addCriterion("jujuetime is not null");
            return (Criteria) this;
        }

        public Criteria andJujuetimeEqualTo(Date value) {
            addCriterion("jujuetime =", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeNotEqualTo(Date value) {
            addCriterion("jujuetime <>", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeGreaterThan(Date value) {
            addCriterion("jujuetime >", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jujuetime >=", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeLessThan(Date value) {
            addCriterion("jujuetime <", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeLessThanOrEqualTo(Date value) {
            addCriterion("jujuetime <=", value, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeIn(List<Date> values) {
            addCriterion("jujuetime in", values, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeNotIn(List<Date> values) {
            addCriterion("jujuetime not in", values, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeBetween(Date value1, Date value2) {
            addCriterion("jujuetime between", value1, value2, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andJujuetimeNotBetween(Date value1, Date value2) {
            addCriterion("jujuetime not between", value1, value2, "jujuetime");
            return (Criteria) this;
        }

        public Criteria andTguotimeIsNull() {
            addCriterion("tguotime is null");
            return (Criteria) this;
        }

        public Criteria andTguotimeIsNotNull() {
            addCriterion("tguotime is not null");
            return (Criteria) this;
        }

        public Criteria andTguotimeEqualTo(Date value) {
            addCriterion("tguotime =", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeNotEqualTo(Date value) {
            addCriterion("tguotime <>", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeGreaterThan(Date value) {
            addCriterion("tguotime >", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tguotime >=", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeLessThan(Date value) {
            addCriterion("tguotime <", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeLessThanOrEqualTo(Date value) {
            addCriterion("tguotime <=", value, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeIn(List<Date> values) {
            addCriterion("tguotime in", values, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeNotIn(List<Date> values) {
            addCriterion("tguotime not in", values, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeBetween(Date value1, Date value2) {
            addCriterion("tguotime between", value1, value2, "tguotime");
            return (Criteria) this;
        }

        public Criteria andTguotimeNotBetween(Date value1, Date value2) {
            addCriterion("tguotime not between", value1, value2, "tguotime");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andYinhangnameIsNull() {
            addCriterion("yinhangname is null");
            return (Criteria) this;
        }

        public Criteria andYinhangnameIsNotNull() {
            addCriterion("yinhangname is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangnameEqualTo(String value) {
            addCriterion("yinhangname =", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameNotEqualTo(String value) {
            addCriterion("yinhangname <>", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameGreaterThan(String value) {
            addCriterion("yinhangname >", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangname >=", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameLessThan(String value) {
            addCriterion("yinhangname <", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameLessThanOrEqualTo(String value) {
            addCriterion("yinhangname <=", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameLike(String value) {
            addCriterion("yinhangname like", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameNotLike(String value) {
            addCriterion("yinhangname not like", value, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameIn(List<String> values) {
            addCriterion("yinhangname in", values, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameNotIn(List<String> values) {
            addCriterion("yinhangname not in", values, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameBetween(String value1, String value2) {
            addCriterion("yinhangname between", value1, value2, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andYinhangnameNotBetween(String value1, String value2) {
            addCriterion("yinhangname not between", value1, value2, "yinhangname");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiIsNull() {
            addCriterion("kaihudizhi is null");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiIsNotNull() {
            addCriterion("kaihudizhi is not null");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiEqualTo(String value) {
            addCriterion("kaihudizhi =", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiNotEqualTo(String value) {
            addCriterion("kaihudizhi <>", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiGreaterThan(String value) {
            addCriterion("kaihudizhi >", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiGreaterThanOrEqualTo(String value) {
            addCriterion("kaihudizhi >=", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiLessThan(String value) {
            addCriterion("kaihudizhi <", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiLessThanOrEqualTo(String value) {
            addCriterion("kaihudizhi <=", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiLike(String value) {
            addCriterion("kaihudizhi like", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiNotLike(String value) {
            addCriterion("kaihudizhi not like", value, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiIn(List<String> values) {
            addCriterion("kaihudizhi in", values, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiNotIn(List<String> values) {
            addCriterion("kaihudizhi not in", values, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiBetween(String value1, String value2) {
            addCriterion("kaihudizhi between", value1, value2, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andKaihudizhiNotBetween(String value1, String value2) {
            addCriterion("kaihudizhi not between", value1, value2, "kaihudizhi");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidIsNull() {
            addCriterion("yinhangkaid is null");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidIsNotNull() {
            addCriterion("yinhangkaid is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidEqualTo(String value) {
            addCriterion("yinhangkaid =", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidNotEqualTo(String value) {
            addCriterion("yinhangkaid <>", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidGreaterThan(String value) {
            addCriterion("yinhangkaid >", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangkaid >=", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidLessThan(String value) {
            addCriterion("yinhangkaid <", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidLessThanOrEqualTo(String value) {
            addCriterion("yinhangkaid <=", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidLike(String value) {
            addCriterion("yinhangkaid like", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidNotLike(String value) {
            addCriterion("yinhangkaid not like", value, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidIn(List<String> values) {
            addCriterion("yinhangkaid in", values, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidNotIn(List<String> values) {
            addCriterion("yinhangkaid not in", values, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidBetween(String value1, String value2) {
            addCriterion("yinhangkaid between", value1, value2, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andYinhangkaidNotBetween(String value1, String value2) {
            addCriterion("yinhangkaid not between", value1, value2, "yinhangkaid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidIsNull() {
            addCriterion("zhuangtaiid is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidIsNotNull() {
            addCriterion("zhuangtaiid is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidEqualTo(Integer value) {
            addCriterion("zhuangtaiid =", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidNotEqualTo(Integer value) {
            addCriterion("zhuangtaiid <>", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidGreaterThan(Integer value) {
            addCriterion("zhuangtaiid >", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuangtaiid >=", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidLessThan(Integer value) {
            addCriterion("zhuangtaiid <", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidLessThanOrEqualTo(Integer value) {
            addCriterion("zhuangtaiid <=", value, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidIn(List<Integer> values) {
            addCriterion("zhuangtaiid in", values, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidNotIn(List<Integer> values) {
            addCriterion("zhuangtaiid not in", values, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtaiid between", value1, value2, "zhuangtaiid");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiidNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuangtaiid not between", value1, value2, "zhuangtaiid");
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