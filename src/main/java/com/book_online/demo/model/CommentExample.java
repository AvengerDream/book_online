package com.book_online.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("CommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("CommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("CommentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("CommentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("CommentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("CommentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("CommentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("CommentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("CommentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("CommentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("CommentId not between", value1, value2, "commentid");
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
            addCriterion("Customername is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("Customername is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("Customername =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("Customername <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("Customername >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("Customername >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("Customername <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("Customername <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("Customername like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("Customername not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("Customername in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("Customername not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("Customername between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("Customername not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNull() {
            addCriterion("commentdate is null");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNotNull() {
            addCriterion("commentdate is not null");
            return (Criteria) this;
        }

        public Criteria andCommentdateEqualTo(Date value) {
            addCriterion("commentdate =", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotEqualTo(Date value) {
            addCriterion("commentdate <>", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThan(Date value) {
            addCriterion("commentdate >", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThanOrEqualTo(Date value) {
            addCriterion("commentdate >=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThan(Date value) {
            addCriterion("commentdate <", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThanOrEqualTo(Date value) {
            addCriterion("commentdate <=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateIn(List<Date> values) {
            addCriterion("commentdate in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotIn(List<Date> values) {
            addCriterion("commentdate not in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateBetween(Date value1, Date value2) {
            addCriterion("commentdate between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotBetween(Date value1, Date value2) {
            addCriterion("commentdate not between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNull() {
            addCriterion("Commentcontent is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("Commentcontent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("Commentcontent =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("Commentcontent <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("Commentcontent >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("Commentcontent >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("Commentcontent <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("Commentcontent <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("Commentcontent like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("Commentcontent not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("Commentcontent in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("Commentcontent not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("Commentcontent between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("Commentcontent not between", value1, value2, "commentcontent");
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