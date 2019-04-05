package com.wuyemy.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KuserExample() {
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

        public Criteria andKidIsNull() {
            addCriterion("kid is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("kid is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Integer value) {
            addCriterion("kid =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Integer value) {
            addCriterion("kid <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Integer value) {
            addCriterion("kid >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Integer value) {
            addCriterion("kid >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Integer value) {
            addCriterion("kid <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Integer value) {
            addCriterion("kid <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Integer> values) {
            addCriterion("kid in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Integer> values) {
            addCriterion("kid not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Integer value1, Integer value2) {
            addCriterion("kid between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Integer value1, Integer value2) {
            addCriterion("kid not between", value1, value2, "kid");
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

        public Criteria andKhnameIsNull() {
            addCriterion("khname is null");
            return (Criteria) this;
        }

        public Criteria andKhnameIsNotNull() {
            addCriterion("khname is not null");
            return (Criteria) this;
        }

        public Criteria andKhnameEqualTo(String value) {
            addCriterion("khname =", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotEqualTo(String value) {
            addCriterion("khname <>", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThan(String value) {
            addCriterion("khname >", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameGreaterThanOrEqualTo(String value) {
            addCriterion("khname >=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThan(String value) {
            addCriterion("khname <", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLessThanOrEqualTo(String value) {
            addCriterion("khname <=", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameLike(String value) {
            addCriterion("khname like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotLike(String value) {
            addCriterion("khname not like", value, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameIn(List<String> values) {
            addCriterion("khname in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotIn(List<String> values) {
            addCriterion("khname not in", values, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameBetween(String value1, String value2) {
            addCriterion("khname between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andKhnameNotBetween(String value1, String value2) {
            addCriterion("khname not between", value1, value2, "khname");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoIsNull() {
            addCriterion("tzhanghao is null");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoIsNotNull() {
            addCriterion("tzhanghao is not null");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoEqualTo(String value) {
            addCriterion("tzhanghao =", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoNotEqualTo(String value) {
            addCriterion("tzhanghao <>", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoGreaterThan(String value) {
            addCriterion("tzhanghao >", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoGreaterThanOrEqualTo(String value) {
            addCriterion("tzhanghao >=", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoLessThan(String value) {
            addCriterion("tzhanghao <", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoLessThanOrEqualTo(String value) {
            addCriterion("tzhanghao <=", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoLike(String value) {
            addCriterion("tzhanghao like", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoNotLike(String value) {
            addCriterion("tzhanghao not like", value, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoIn(List<String> values) {
            addCriterion("tzhanghao in", values, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoNotIn(List<String> values) {
            addCriterion("tzhanghao not in", values, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoBetween(String value1, String value2) {
            addCriterion("tzhanghao between", value1, value2, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andTzhanghaoNotBetween(String value1, String value2) {
            addCriterion("tzhanghao not between", value1, value2, "tzhanghao");
            return (Criteria) this;
        }

        public Criteria andZhucetimeIsNull() {
            addCriterion("zhucetime is null");
            return (Criteria) this;
        }

        public Criteria andZhucetimeIsNotNull() {
            addCriterion("zhucetime is not null");
            return (Criteria) this;
        }

        public Criteria andZhucetimeEqualTo(Date value) {
            addCriterion("zhucetime =", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeNotEqualTo(Date value) {
            addCriterion("zhucetime <>", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeGreaterThan(Date value) {
            addCriterion("zhucetime >", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("zhucetime >=", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeLessThan(Date value) {
            addCriterion("zhucetime <", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeLessThanOrEqualTo(Date value) {
            addCriterion("zhucetime <=", value, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeIn(List<Date> values) {
            addCriterion("zhucetime in", values, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeNotIn(List<Date> values) {
            addCriterion("zhucetime not in", values, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeBetween(Date value1, Date value2) {
            addCriterion("zhucetime between", value1, value2, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andZhucetimeNotBetween(Date value1, Date value2) {
            addCriterion("zhucetime not between", value1, value2, "zhucetime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeIsNull() {
            addCriterion("jihuotime is null");
            return (Criteria) this;
        }

        public Criteria andJihuotimeIsNotNull() {
            addCriterion("jihuotime is not null");
            return (Criteria) this;
        }

        public Criteria andJihuotimeEqualTo(Date value) {
            addCriterion("jihuotime =", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeNotEqualTo(Date value) {
            addCriterion("jihuotime <>", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeGreaterThan(Date value) {
            addCriterion("jihuotime >", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("jihuotime >=", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeLessThan(Date value) {
            addCriterion("jihuotime <", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeLessThanOrEqualTo(Date value) {
            addCriterion("jihuotime <=", value, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeIn(List<Date> values) {
            addCriterion("jihuotime in", values, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeNotIn(List<Date> values) {
            addCriterion("jihuotime not in", values, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeBetween(Date value1, Date value2) {
            addCriterion("jihuotime between", value1, value2, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andJihuotimeNotBetween(Date value1, Date value2) {
            addCriterion("jihuotime not between", value1, value2, "jihuotime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeIsNull() {
            addCriterion("dongjietime is null");
            return (Criteria) this;
        }

        public Criteria andDongjietimeIsNotNull() {
            addCriterion("dongjietime is not null");
            return (Criteria) this;
        }

        public Criteria andDongjietimeEqualTo(Date value) {
            addCriterion("dongjietime =", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeNotEqualTo(Date value) {
            addCriterion("dongjietime <>", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeGreaterThan(Date value) {
            addCriterion("dongjietime >", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dongjietime >=", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeLessThan(Date value) {
            addCriterion("dongjietime <", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeLessThanOrEqualTo(Date value) {
            addCriterion("dongjietime <=", value, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeIn(List<Date> values) {
            addCriterion("dongjietime in", values, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeNotIn(List<Date> values) {
            addCriterion("dongjietime not in", values, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeBetween(Date value1, Date value2) {
            addCriterion("dongjietime between", value1, value2, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andDongjietimeNotBetween(Date value1, Date value2) {
            addCriterion("dongjietime not between", value1, value2, "dongjietime");
            return (Criteria) this;
        }

        public Criteria andYyzxidIsNull() {
            addCriterion("yyzxid is null");
            return (Criteria) this;
        }

        public Criteria andYyzxidIsNotNull() {
            addCriterion("yyzxid is not null");
            return (Criteria) this;
        }

        public Criteria andYyzxidEqualTo(String value) {
            addCriterion("yyzxid =", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotEqualTo(String value) {
            addCriterion("yyzxid <>", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidGreaterThan(String value) {
            addCriterion("yyzxid >", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidGreaterThanOrEqualTo(String value) {
            addCriterion("yyzxid >=", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidLessThan(String value) {
            addCriterion("yyzxid <", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidLessThanOrEqualTo(String value) {
            addCriterion("yyzxid <=", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidLike(String value) {
            addCriterion("yyzxid like", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotLike(String value) {
            addCriterion("yyzxid not like", value, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidIn(List<String> values) {
            addCriterion("yyzxid in", values, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotIn(List<String> values) {
            addCriterion("yyzxid not in", values, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidBetween(String value1, String value2) {
            addCriterion("yyzxid between", value1, value2, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andYyzxidNotBetween(String value1, String value2) {
            addCriterion("yyzxid not between", value1, value2, "yyzxid");
            return (Criteria) this;
        }

        public Criteria andShenfenidIsNull() {
            addCriterion("shenfenid is null");
            return (Criteria) this;
        }

        public Criteria andShenfenidIsNotNull() {
            addCriterion("shenfenid is not null");
            return (Criteria) this;
        }

        public Criteria andShenfenidEqualTo(String value) {
            addCriterion("shenfenid =", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidNotEqualTo(String value) {
            addCriterion("shenfenid <>", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidGreaterThan(String value) {
            addCriterion("shenfenid >", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidGreaterThanOrEqualTo(String value) {
            addCriterion("shenfenid >=", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidLessThan(String value) {
            addCriterion("shenfenid <", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidLessThanOrEqualTo(String value) {
            addCriterion("shenfenid <=", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidLike(String value) {
            addCriterion("shenfenid like", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidNotLike(String value) {
            addCriterion("shenfenid not like", value, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidIn(List<String> values) {
            addCriterion("shenfenid in", values, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidNotIn(List<String> values) {
            addCriterion("shenfenid not in", values, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidBetween(String value1, String value2) {
            addCriterion("shenfenid between", value1, value2, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andShenfenidNotBetween(String value1, String value2) {
            addCriterion("shenfenid not between", value1, value2, "shenfenid");
            return (Criteria) this;
        }

        public Criteria andKpasswordIsNull() {
            addCriterion("kpassword is null");
            return (Criteria) this;
        }

        public Criteria andKpasswordIsNotNull() {
            addCriterion("kpassword is not null");
            return (Criteria) this;
        }

        public Criteria andKpasswordEqualTo(String value) {
            addCriterion("kpassword =", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordNotEqualTo(String value) {
            addCriterion("kpassword <>", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordGreaterThan(String value) {
            addCriterion("kpassword >", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("kpassword >=", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordLessThan(String value) {
            addCriterion("kpassword <", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordLessThanOrEqualTo(String value) {
            addCriterion("kpassword <=", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordLike(String value) {
            addCriterion("kpassword like", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordNotLike(String value) {
            addCriterion("kpassword not like", value, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordIn(List<String> values) {
            addCriterion("kpassword in", values, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordNotIn(List<String> values) {
            addCriterion("kpassword not in", values, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordBetween(String value1, String value2) {
            addCriterion("kpassword between", value1, value2, "kpassword");
            return (Criteria) this;
        }

        public Criteria andKpasswordNotBetween(String value1, String value2) {
            addCriterion("kpassword not between", value1, value2, "kpassword");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoIsNull() {
            addCriterion("zhenshishoujihao is null");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoIsNotNull() {
            addCriterion("zhenshishoujihao is not null");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoEqualTo(String value) {
            addCriterion("zhenshishoujihao =", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoNotEqualTo(String value) {
            addCriterion("zhenshishoujihao <>", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoGreaterThan(String value) {
            addCriterion("zhenshishoujihao >", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhenshishoujihao >=", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoLessThan(String value) {
            addCriterion("zhenshishoujihao <", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoLessThanOrEqualTo(String value) {
            addCriterion("zhenshishoujihao <=", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoLike(String value) {
            addCriterion("zhenshishoujihao like", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoNotLike(String value) {
            addCriterion("zhenshishoujihao not like", value, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoIn(List<String> values) {
            addCriterion("zhenshishoujihao in", values, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoNotIn(List<String> values) {
            addCriterion("zhenshishoujihao not in", values, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoBetween(String value1, String value2) {
            addCriterion("zhenshishoujihao between", value1, value2, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshishoujihaoNotBetween(String value1, String value2) {
            addCriterion("zhenshishoujihao not between", value1, value2, "zhenshishoujihao");
            return (Criteria) this;
        }

        public Criteria andZhenshinameIsNull() {
            addCriterion("zhenshiname is null");
            return (Criteria) this;
        }

        public Criteria andZhenshinameIsNotNull() {
            addCriterion("zhenshiname is not null");
            return (Criteria) this;
        }

        public Criteria andZhenshinameEqualTo(String value) {
            addCriterion("zhenshiname =", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameNotEqualTo(String value) {
            addCriterion("zhenshiname <>", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameGreaterThan(String value) {
            addCriterion("zhenshiname >", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameGreaterThanOrEqualTo(String value) {
            addCriterion("zhenshiname >=", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameLessThan(String value) {
            addCriterion("zhenshiname <", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameLessThanOrEqualTo(String value) {
            addCriterion("zhenshiname <=", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameLike(String value) {
            addCriterion("zhenshiname like", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameNotLike(String value) {
            addCriterion("zhenshiname not like", value, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameIn(List<String> values) {
            addCriterion("zhenshiname in", values, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameNotIn(List<String> values) {
            addCriterion("zhenshiname not in", values, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameBetween(String value1, String value2) {
            addCriterion("zhenshiname between", value1, value2, "zhenshiname");
            return (Criteria) this;
        }

        public Criteria andZhenshinameNotBetween(String value1, String value2) {
            addCriterion("zhenshiname not between", value1, value2, "zhenshiname");
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

        public Criteria andYinhangkajaoIsNull() {
            addCriterion("yinhangkajao is null");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoIsNotNull() {
            addCriterion("yinhangkajao is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoEqualTo(String value) {
            addCriterion("yinhangkajao =", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoNotEqualTo(String value) {
            addCriterion("yinhangkajao <>", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoGreaterThan(String value) {
            addCriterion("yinhangkajao >", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoGreaterThanOrEqualTo(String value) {
            addCriterion("yinhangkajao >=", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoLessThan(String value) {
            addCriterion("yinhangkajao <", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoLessThanOrEqualTo(String value) {
            addCriterion("yinhangkajao <=", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoLike(String value) {
            addCriterion("yinhangkajao like", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoNotLike(String value) {
            addCriterion("yinhangkajao not like", value, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoIn(List<String> values) {
            addCriterion("yinhangkajao in", values, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoNotIn(List<String> values) {
            addCriterion("yinhangkajao not in", values, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoBetween(String value1, String value2) {
            addCriterion("yinhangkajao between", value1, value2, "yinhangkajao");
            return (Criteria) this;
        }

        public Criteria andYinhangkajaoNotBetween(String value1, String value2) {
            addCriterion("yinhangkajao not between", value1, value2, "yinhangkajao");
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

        public Criteria andZhifubaoidIsNull() {
            addCriterion("zhifubaoid is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidIsNotNull() {
            addCriterion("zhifubaoid is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidEqualTo(String value) {
            addCriterion("zhifubaoid =", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidNotEqualTo(String value) {
            addCriterion("zhifubaoid <>", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidGreaterThan(String value) {
            addCriterion("zhifubaoid >", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubaoid >=", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidLessThan(String value) {
            addCriterion("zhifubaoid <", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidLessThanOrEqualTo(String value) {
            addCriterion("zhifubaoid <=", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidLike(String value) {
            addCriterion("zhifubaoid like", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidNotLike(String value) {
            addCriterion("zhifubaoid not like", value, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidIn(List<String> values) {
            addCriterion("zhifubaoid in", values, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidNotIn(List<String> values) {
            addCriterion("zhifubaoid not in", values, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidBetween(String value1, String value2) {
            addCriterion("zhifubaoid between", value1, value2, "zhifubaoid");
            return (Criteria) this;
        }

        public Criteria andZhifubaoidNotBetween(String value1, String value2) {
            addCriterion("zhifubaoid not between", value1, value2, "zhifubaoid");
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