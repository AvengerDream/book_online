package com.book_online.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerInfoExample() {
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

        public Criteria andCustomeridIsNull() {
            addCriterion("CustomerId is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CustomerId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Integer value) {
            addCriterion("CustomerId =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Integer value) {
            addCriterion("CustomerId <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Integer value) {
            addCriterion("CustomerId >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerId >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Integer value) {
            addCriterion("CustomerId <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerId <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Integer> values) {
            addCriterion("CustomerId in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Integer> values) {
            addCriterion("CustomerId not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Integer value1, Integer value2) {
            addCriterion("CustomerId between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerId not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("CustomerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("CustomerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("CustomerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("CustomerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("CustomerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("CustomerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("CustomerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("CustomerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("CustomerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("CustomerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("CustomerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("CustomerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("CustomerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIsNull() {
            addCriterion("CustomerPwd is null");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIsNotNull() {
            addCriterion("CustomerPwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdEqualTo(String value) {
            addCriterion("CustomerPwd =", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotEqualTo(String value) {
            addCriterion("CustomerPwd <>", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdGreaterThan(String value) {
            addCriterion("CustomerPwd >", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerPwd >=", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLessThan(String value) {
            addCriterion("CustomerPwd <", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLessThanOrEqualTo(String value) {
            addCriterion("CustomerPwd <=", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdLike(String value) {
            addCriterion("CustomerPwd like", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotLike(String value) {
            addCriterion("CustomerPwd not like", value, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdIn(List<String> values) {
            addCriterion("CustomerPwd in", values, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotIn(List<String> values) {
            addCriterion("CustomerPwd not in", values, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdBetween(String value1, String value2) {
            addCriterion("CustomerPwd between", value1, value2, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomerpwdNotBetween(String value1, String value2) {
            addCriterion("CustomerPwd not between", value1, value2, "customerpwd");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameIsNull() {
            addCriterion("Customertruename is null");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameIsNotNull() {
            addCriterion("Customertruename is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameEqualTo(String value) {
            addCriterion("Customertruename =", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameNotEqualTo(String value) {
            addCriterion("Customertruename <>", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameGreaterThan(String value) {
            addCriterion("Customertruename >", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameGreaterThanOrEqualTo(String value) {
            addCriterion("Customertruename >=", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameLessThan(String value) {
            addCriterion("Customertruename <", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameLessThanOrEqualTo(String value) {
            addCriterion("Customertruename <=", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameLike(String value) {
            addCriterion("Customertruename like", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameNotLike(String value) {
            addCriterion("Customertruename not like", value, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameIn(List<String> values) {
            addCriterion("Customertruename in", values, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameNotIn(List<String> values) {
            addCriterion("Customertruename not in", values, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameBetween(String value1, String value2) {
            addCriterion("Customertruename between", value1, value2, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomertruenameNotBetween(String value1, String value2) {
            addCriterion("Customertruename not between", value1, value2, "customertruename");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNull() {
            addCriterion("CustomerSex is null");
            return (Criteria) this;
        }

        public Criteria andCustomersexIsNotNull() {
            addCriterion("CustomerSex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersexEqualTo(String value) {
            addCriterion("CustomerSex =", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotEqualTo(String value) {
            addCriterion("CustomerSex <>", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThan(String value) {
            addCriterion("CustomerSex >", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerSex >=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThan(String value) {
            addCriterion("CustomerSex <", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLessThanOrEqualTo(String value) {
            addCriterion("CustomerSex <=", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexLike(String value) {
            addCriterion("CustomerSex like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotLike(String value) {
            addCriterion("CustomerSex not like", value, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexIn(List<String> values) {
            addCriterion("CustomerSex in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotIn(List<String> values) {
            addCriterion("CustomerSex not in", values, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexBetween(String value1, String value2) {
            addCriterion("CustomerSex between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomersexNotBetween(String value1, String value2) {
            addCriterion("CustomerSex not between", value1, value2, "customersex");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNull() {
            addCriterion("CustomerTel is null");
            return (Criteria) this;
        }

        public Criteria andCustomertelIsNotNull() {
            addCriterion("CustomerTel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomertelEqualTo(String value) {
            addCriterion("CustomerTel =", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotEqualTo(String value) {
            addCriterion("CustomerTel <>", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThan(String value) {
            addCriterion("CustomerTel >", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerTel >=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThan(String value) {
            addCriterion("CustomerTel <", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLessThanOrEqualTo(String value) {
            addCriterion("CustomerTel <=", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelLike(String value) {
            addCriterion("CustomerTel like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotLike(String value) {
            addCriterion("CustomerTel not like", value, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelIn(List<String> values) {
            addCriterion("CustomerTel in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotIn(List<String> values) {
            addCriterion("CustomerTel not in", values, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelBetween(String value1, String value2) {
            addCriterion("CustomerTel between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomertelNotBetween(String value1, String value2) {
            addCriterion("CustomerTel not between", value1, value2, "customertel");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIsNull() {
            addCriterion("CustomerEmail is null");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIsNotNull() {
            addCriterion("CustomerEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeremailEqualTo(String value) {
            addCriterion("CustomerEmail =", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotEqualTo(String value) {
            addCriterion("CustomerEmail <>", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailGreaterThan(String value) {
            addCriterion("CustomerEmail >", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerEmail >=", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLessThan(String value) {
            addCriterion("CustomerEmail <", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLessThanOrEqualTo(String value) {
            addCriterion("CustomerEmail <=", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailLike(String value) {
            addCriterion("CustomerEmail like", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotLike(String value) {
            addCriterion("CustomerEmail not like", value, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailIn(List<String> values) {
            addCriterion("CustomerEmail in", values, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotIn(List<String> values) {
            addCriterion("CustomerEmail not in", values, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailBetween(String value1, String value2) {
            addCriterion("CustomerEmail between", value1, value2, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeremailNotBetween(String value1, String value2) {
            addCriterion("CustomerEmail not between", value1, value2, "customeremail");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIsNull() {
            addCriterion("CustomerAddr is null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIsNotNull() {
            addCriterion("CustomerAddr is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrEqualTo(String value) {
            addCriterion("CustomerAddr =", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotEqualTo(String value) {
            addCriterion("CustomerAddr <>", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrGreaterThan(String value) {
            addCriterion("CustomerAddr >", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerAddr >=", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLessThan(String value) {
            addCriterion("CustomerAddr <", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLessThanOrEqualTo(String value) {
            addCriterion("CustomerAddr <=", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrLike(String value) {
            addCriterion("CustomerAddr like", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotLike(String value) {
            addCriterion("CustomerAddr not like", value, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrIn(List<String> values) {
            addCriterion("CustomerAddr in", values, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotIn(List<String> values) {
            addCriterion("CustomerAddr not in", values, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrBetween(String value1, String value2) {
            addCriterion("CustomerAddr between", value1, value2, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomeraddrNotBetween(String value1, String value2) {
            addCriterion("CustomerAddr not between", value1, value2, "customeraddr");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeIsNull() {
            addCriterion("CustomerRegTime is null");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeIsNotNull() {
            addCriterion("CustomerRegTime is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeEqualTo(Date value) {
            addCriterion("CustomerRegTime =", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeNotEqualTo(Date value) {
            addCriterion("CustomerRegTime <>", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeGreaterThan(Date value) {
            addCriterion("CustomerRegTime >", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CustomerRegTime >=", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeLessThan(Date value) {
            addCriterion("CustomerRegTime <", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeLessThanOrEqualTo(Date value) {
            addCriterion("CustomerRegTime <=", value, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeIn(List<Date> values) {
            addCriterion("CustomerRegTime in", values, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeNotIn(List<Date> values) {
            addCriterion("CustomerRegTime not in", values, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeBetween(Date value1, Date value2) {
            addCriterion("CustomerRegTime between", value1, value2, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerregtimeNotBetween(Date value1, Date value2) {
            addCriterion("CustomerRegTime not between", value1, value2, "customerregtime");
            return (Criteria) this;
        }

        public Criteria andCustomerquesIsNull() {
            addCriterion("CustomerQues is null");
            return (Criteria) this;
        }

        public Criteria andCustomerquesIsNotNull() {
            addCriterion("CustomerQues is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerquesEqualTo(String value) {
            addCriterion("CustomerQues =", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesNotEqualTo(String value) {
            addCriterion("CustomerQues <>", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesGreaterThan(String value) {
            addCriterion("CustomerQues >", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerQues >=", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesLessThan(String value) {
            addCriterion("CustomerQues <", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesLessThanOrEqualTo(String value) {
            addCriterion("CustomerQues <=", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesLike(String value) {
            addCriterion("CustomerQues like", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesNotLike(String value) {
            addCriterion("CustomerQues not like", value, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesIn(List<String> values) {
            addCriterion("CustomerQues in", values, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesNotIn(List<String> values) {
            addCriterion("CustomerQues not in", values, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesBetween(String value1, String value2) {
            addCriterion("CustomerQues between", value1, value2, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomerquesNotBetween(String value1, String value2) {
            addCriterion("CustomerQues not between", value1, value2, "customerques");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerIsNull() {
            addCriterion("CustomerAnswer is null");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerIsNotNull() {
            addCriterion("CustomerAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerEqualTo(String value) {
            addCriterion("CustomerAnswer =", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerNotEqualTo(String value) {
            addCriterion("CustomerAnswer <>", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerGreaterThan(String value) {
            addCriterion("CustomerAnswer >", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerGreaterThanOrEqualTo(String value) {
            addCriterion("CustomerAnswer >=", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerLessThan(String value) {
            addCriterion("CustomerAnswer <", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerLessThanOrEqualTo(String value) {
            addCriterion("CustomerAnswer <=", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerLike(String value) {
            addCriterion("CustomerAnswer like", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerNotLike(String value) {
            addCriterion("CustomerAnswer not like", value, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerIn(List<String> values) {
            addCriterion("CustomerAnswer in", values, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerNotIn(List<String> values) {
            addCriterion("CustomerAnswer not in", values, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerBetween(String value1, String value2) {
            addCriterion("CustomerAnswer between", value1, value2, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomeranswerNotBetween(String value1, String value2) {
            addCriterion("CustomerAnswer not between", value1, value2, "customeranswer");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeIsNull() {
            addCriterion("CustomerLogTime is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeIsNotNull() {
            addCriterion("CustomerLogTime is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeEqualTo(Integer value) {
            addCriterion("CustomerLogTime =", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeNotEqualTo(Integer value) {
            addCriterion("CustomerLogTime <>", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeGreaterThan(Integer value) {
            addCriterion("CustomerLogTime >", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerLogTime >=", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeLessThan(Integer value) {
            addCriterion("CustomerLogTime <", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerLogTime <=", value, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeIn(List<Integer> values) {
            addCriterion("CustomerLogTime in", values, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeNotIn(List<Integer> values) {
            addCriterion("CustomerLogTime not in", values, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeBetween(Integer value1, Integer value2) {
            addCriterion("CustomerLogTime between", value1, value2, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlogtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerLogTime not between", value1, value2, "customerlogtime");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtIsNull() {
            addCriterion("CustomerLastLogT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtIsNotNull() {
            addCriterion("CustomerLastLogT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtEqualTo(Date value) {
            addCriterion("CustomerLastLogT =", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtNotEqualTo(Date value) {
            addCriterion("CustomerLastLogT <>", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtGreaterThan(Date value) {
            addCriterion("CustomerLastLogT >", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtGreaterThanOrEqualTo(Date value) {
            addCriterion("CustomerLastLogT >=", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtLessThan(Date value) {
            addCriterion("CustomerLastLogT <", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtLessThanOrEqualTo(Date value) {
            addCriterion("CustomerLastLogT <=", value, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtIn(List<Date> values) {
            addCriterion("CustomerLastLogT in", values, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtNotIn(List<Date> values) {
            addCriterion("CustomerLastLogT not in", values, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtBetween(Date value1, Date value2) {
            addCriterion("CustomerLastLogT between", value1, value2, "customerlastlogt");
            return (Criteria) this;
        }

        public Criteria andCustomerlastlogtNotBetween(Date value1, Date value2) {
            addCriterion("CustomerLastLogT not between", value1, value2, "customerlastlogt");
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