package com.book_online.demo.model;

import java.util.ArrayList;
import java.util.List;

public class ShopBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopBookExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("BookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("BookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("BookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("BookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("BookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("BookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("BookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("BookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("BookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("BookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andOrdermountIsNull() {
            addCriterion("ordermount is null");
            return (Criteria) this;
        }

        public Criteria andOrdermountIsNotNull() {
            addCriterion("ordermount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdermountEqualTo(Integer value) {
            addCriterion("ordermount =", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountNotEqualTo(Integer value) {
            addCriterion("ordermount <>", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountGreaterThan(Integer value) {
            addCriterion("ordermount >", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordermount >=", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountLessThan(Integer value) {
            addCriterion("ordermount <", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountLessThanOrEqualTo(Integer value) {
            addCriterion("ordermount <=", value, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountIn(List<Integer> values) {
            addCriterion("ordermount in", values, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountNotIn(List<Integer> values) {
            addCriterion("ordermount not in", values, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountBetween(Integer value1, Integer value2) {
            addCriterion("ordermount between", value1, value2, "ordermount");
            return (Criteria) this;
        }

        public Criteria andOrdermountNotBetween(Integer value1, Integer value2) {
            addCriterion("ordermount not between", value1, value2, "ordermount");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("ispay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("ispay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(String value) {
            addCriterion("ispay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(String value) {
            addCriterion("ispay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(String value) {
            addCriterion("ispay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(String value) {
            addCriterion("ispay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(String value) {
            addCriterion("ispay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(String value) {
            addCriterion("ispay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLike(String value) {
            addCriterion("ispay like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotLike(String value) {
            addCriterion("ispay not like", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<String> values) {
            addCriterion("ispay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<String> values) {
            addCriterion("ispay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(String value1, String value2) {
            addCriterion("ispay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(String value1, String value2) {
            addCriterion("ispay not between", value1, value2, "ispay");
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