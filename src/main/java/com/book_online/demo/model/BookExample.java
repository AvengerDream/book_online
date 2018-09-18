package com.book_online.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBooktypeidIsNull() {
            addCriterion("BookTypeId is null");
            return (Criteria) this;
        }

        public Criteria andBooktypeidIsNotNull() {
            addCriterion("BookTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andBooktypeidEqualTo(Integer value) {
            addCriterion("BookTypeId =", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidNotEqualTo(Integer value) {
            addCriterion("BookTypeId <>", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidGreaterThan(Integer value) {
            addCriterion("BookTypeId >", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookTypeId >=", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidLessThan(Integer value) {
            addCriterion("BookTypeId <", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidLessThanOrEqualTo(Integer value) {
            addCriterion("BookTypeId <=", value, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidIn(List<Integer> values) {
            addCriterion("BookTypeId in", values, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidNotIn(List<Integer> values) {
            addCriterion("BookTypeId not in", values, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidBetween(Integer value1, Integer value2) {
            addCriterion("BookTypeId between", value1, value2, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooktypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("BookTypeId not between", value1, value2, "booktypeid");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("BookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("BookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("BookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("BookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("BookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("BookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("BookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("BookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("BookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("BookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("BookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("BookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("BookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("BookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBookpressIsNull() {
            addCriterion("BookPress is null");
            return (Criteria) this;
        }

        public Criteria andBookpressIsNotNull() {
            addCriterion("BookPress is not null");
            return (Criteria) this;
        }

        public Criteria andBookpressEqualTo(String value) {
            addCriterion("BookPress =", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressNotEqualTo(String value) {
            addCriterion("BookPress <>", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressGreaterThan(String value) {
            addCriterion("BookPress >", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressGreaterThanOrEqualTo(String value) {
            addCriterion("BookPress >=", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressLessThan(String value) {
            addCriterion("BookPress <", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressLessThanOrEqualTo(String value) {
            addCriterion("BookPress <=", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressLike(String value) {
            addCriterion("BookPress like", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressNotLike(String value) {
            addCriterion("BookPress not like", value, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressIn(List<String> values) {
            addCriterion("BookPress in", values, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressNotIn(List<String> values) {
            addCriterion("BookPress not in", values, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressBetween(String value1, String value2) {
            addCriterion("BookPress between", value1, value2, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpressNotBetween(String value1, String value2) {
            addCriterion("BookPress not between", value1, value2, "bookpress");
            return (Criteria) this;
        }

        public Criteria andBookpubdateIsNull() {
            addCriterion("BookPubDate is null");
            return (Criteria) this;
        }

        public Criteria andBookpubdateIsNotNull() {
            addCriterion("BookPubDate is not null");
            return (Criteria) this;
        }

        public Criteria andBookpubdateEqualTo(Date value) {
            addCriterion("BookPubDate =", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateNotEqualTo(Date value) {
            addCriterion("BookPubDate <>", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateGreaterThan(Date value) {
            addCriterion("BookPubDate >", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("BookPubDate >=", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateLessThan(Date value) {
            addCriterion("BookPubDate <", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateLessThanOrEqualTo(Date value) {
            addCriterion("BookPubDate <=", value, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateIn(List<Date> values) {
            addCriterion("BookPubDate in", values, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateNotIn(List<Date> values) {
            addCriterion("BookPubDate not in", values, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateBetween(Date value1, Date value2) {
            addCriterion("BookPubDate between", value1, value2, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookpubdateNotBetween(Date value1, Date value2) {
            addCriterion("BookPubDate not between", value1, value2, "bookpubdate");
            return (Criteria) this;
        }

        public Criteria andBookauthorIsNull() {
            addCriterion("BookAuthor is null");
            return (Criteria) this;
        }

        public Criteria andBookauthorIsNotNull() {
            addCriterion("BookAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andBookauthorEqualTo(String value) {
            addCriterion("BookAuthor =", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotEqualTo(String value) {
            addCriterion("BookAuthor <>", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorGreaterThan(String value) {
            addCriterion("BookAuthor >", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorGreaterThanOrEqualTo(String value) {
            addCriterion("BookAuthor >=", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLessThan(String value) {
            addCriterion("BookAuthor <", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLessThanOrEqualTo(String value) {
            addCriterion("BookAuthor <=", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLike(String value) {
            addCriterion("BookAuthor like", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotLike(String value) {
            addCriterion("BookAuthor not like", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorIn(List<String> values) {
            addCriterion("BookAuthor in", values, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotIn(List<String> values) {
            addCriterion("BookAuthor not in", values, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorBetween(String value1, String value2) {
            addCriterion("BookAuthor between", value1, value2, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotBetween(String value1, String value2) {
            addCriterion("BookAuthor not between", value1, value2, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNull() {
            addCriterion("BookPrice is null");
            return (Criteria) this;
        }

        public Criteria andBookpriceIsNotNull() {
            addCriterion("BookPrice is not null");
            return (Criteria) this;
        }

        public Criteria andBookpriceEqualTo(Double value) {
            addCriterion("BookPrice =", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotEqualTo(Double value) {
            addCriterion("BookPrice <>", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThan(Double value) {
            addCriterion("BookPrice >", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("BookPrice >=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThan(Double value) {
            addCriterion("BookPrice <", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceLessThanOrEqualTo(Double value) {
            addCriterion("BookPrice <=", value, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceIn(List<Double> values) {
            addCriterion("BookPrice in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotIn(List<Double> values) {
            addCriterion("BookPrice not in", values, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceBetween(Double value1, Double value2) {
            addCriterion("BookPrice between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpriceNotBetween(Double value1, Double value2) {
            addCriterion("BookPrice not between", value1, value2, "bookprice");
            return (Criteria) this;
        }

        public Criteria andBookpagesIsNull() {
            addCriterion("BookPages is null");
            return (Criteria) this;
        }

        public Criteria andBookpagesIsNotNull() {
            addCriterion("BookPages is not null");
            return (Criteria) this;
        }

        public Criteria andBookpagesEqualTo(Integer value) {
            addCriterion("BookPages =", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesNotEqualTo(Integer value) {
            addCriterion("BookPages <>", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesGreaterThan(Integer value) {
            addCriterion("BookPages >", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookPages >=", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesLessThan(Integer value) {
            addCriterion("BookPages <", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesLessThanOrEqualTo(Integer value) {
            addCriterion("BookPages <=", value, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesIn(List<Integer> values) {
            addCriterion("BookPages in", values, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesNotIn(List<Integer> values) {
            addCriterion("BookPages not in", values, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesBetween(Integer value1, Integer value2) {
            addCriterion("BookPages between", value1, value2, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookpagesNotBetween(Integer value1, Integer value2) {
            addCriterion("BookPages not between", value1, value2, "bookpages");
            return (Criteria) this;
        }

        public Criteria andBookoutlineIsNull() {
            addCriterion("BookOutline is null");
            return (Criteria) this;
        }

        public Criteria andBookoutlineIsNotNull() {
            addCriterion("BookOutline is not null");
            return (Criteria) this;
        }

        public Criteria andBookoutlineEqualTo(String value) {
            addCriterion("BookOutline =", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineNotEqualTo(String value) {
            addCriterion("BookOutline <>", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineGreaterThan(String value) {
            addCriterion("BookOutline >", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineGreaterThanOrEqualTo(String value) {
            addCriterion("BookOutline >=", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineLessThan(String value) {
            addCriterion("BookOutline <", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineLessThanOrEqualTo(String value) {
            addCriterion("BookOutline <=", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineLike(String value) {
            addCriterion("BookOutline like", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineNotLike(String value) {
            addCriterion("BookOutline not like", value, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineIn(List<String> values) {
            addCriterion("BookOutline in", values, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineNotIn(List<String> values) {
            addCriterion("BookOutline not in", values, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineBetween(String value1, String value2) {
            addCriterion("BookOutline between", value1, value2, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookoutlineNotBetween(String value1, String value2) {
            addCriterion("BookOutline not between", value1, value2, "bookoutline");
            return (Criteria) this;
        }

        public Criteria andBookdealmountIsNull() {
            addCriterion("BookDealmount is null");
            return (Criteria) this;
        }

        public Criteria andBookdealmountIsNotNull() {
            addCriterion("BookDealmount is not null");
            return (Criteria) this;
        }

        public Criteria andBookdealmountEqualTo(Integer value) {
            addCriterion("BookDealmount =", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountNotEqualTo(Integer value) {
            addCriterion("BookDealmount <>", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountGreaterThan(Integer value) {
            addCriterion("BookDealmount >", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookDealmount >=", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountLessThan(Integer value) {
            addCriterion("BookDealmount <", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountLessThanOrEqualTo(Integer value) {
            addCriterion("BookDealmount <=", value, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountIn(List<Integer> values) {
            addCriterion("BookDealmount in", values, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountNotIn(List<Integer> values) {
            addCriterion("BookDealmount not in", values, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountBetween(Integer value1, Integer value2) {
            addCriterion("BookDealmount between", value1, value2, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookdealmountNotBetween(Integer value1, Integer value2) {
            addCriterion("BookDealmount not between", value1, value2, "bookdealmount");
            return (Criteria) this;
        }

        public Criteria andBookpicIsNull() {
            addCriterion("BookPic is null");
            return (Criteria) this;
        }

        public Criteria andBookpicIsNotNull() {
            addCriterion("BookPic is not null");
            return (Criteria) this;
        }

        public Criteria andBookpicEqualTo(String value) {
            addCriterion("BookPic =", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicNotEqualTo(String value) {
            addCriterion("BookPic <>", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicGreaterThan(String value) {
            addCriterion("BookPic >", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicGreaterThanOrEqualTo(String value) {
            addCriterion("BookPic >=", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicLessThan(String value) {
            addCriterion("BookPic <", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicLessThanOrEqualTo(String value) {
            addCriterion("BookPic <=", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicLike(String value) {
            addCriterion("BookPic like", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicNotLike(String value) {
            addCriterion("BookPic not like", value, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicIn(List<String> values) {
            addCriterion("BookPic in", values, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicNotIn(List<String> values) {
            addCriterion("BookPic not in", values, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicBetween(String value1, String value2) {
            addCriterion("BookPic between", value1, value2, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookpicNotBetween(String value1, String value2) {
            addCriterion("BookPic not between", value1, value2, "bookpic");
            return (Criteria) this;
        }

        public Criteria andBookstoremountIsNull() {
            addCriterion("BookStoremount is null");
            return (Criteria) this;
        }

        public Criteria andBookstoremountIsNotNull() {
            addCriterion("BookStoremount is not null");
            return (Criteria) this;
        }

        public Criteria andBookstoremountEqualTo(Integer value) {
            addCriterion("BookStoremount =", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountNotEqualTo(Integer value) {
            addCriterion("BookStoremount <>", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountGreaterThan(Integer value) {
            addCriterion("BookStoremount >", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BookStoremount >=", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountLessThan(Integer value) {
            addCriterion("BookStoremount <", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountLessThanOrEqualTo(Integer value) {
            addCriterion("BookStoremount <=", value, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountIn(List<Integer> values) {
            addCriterion("BookStoremount in", values, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountNotIn(List<Integer> values) {
            addCriterion("BookStoremount not in", values, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountBetween(Integer value1, Integer value2) {
            addCriterion("BookStoremount between", value1, value2, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoremountNotBetween(Integer value1, Integer value2) {
            addCriterion("BookStoremount not between", value1, value2, "bookstoremount");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeIsNull() {
            addCriterion("BookStoretime is null");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeIsNotNull() {
            addCriterion("BookStoretime is not null");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeEqualTo(Date value) {
            addCriterion("BookStoretime =", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeNotEqualTo(Date value) {
            addCriterion("BookStoretime <>", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeGreaterThan(Date value) {
            addCriterion("BookStoretime >", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BookStoretime >=", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeLessThan(Date value) {
            addCriterion("BookStoretime <", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeLessThanOrEqualTo(Date value) {
            addCriterion("BookStoretime <=", value, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeIn(List<Date> values) {
            addCriterion("BookStoretime in", values, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeNotIn(List<Date> values) {
            addCriterion("BookStoretime not in", values, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeBetween(Date value1, Date value2) {
            addCriterion("BookStoretime between", value1, value2, "bookstoretime");
            return (Criteria) this;
        }

        public Criteria andBookstoretimeNotBetween(Date value1, Date value2) {
            addCriterion("BookStoretime not between", value1, value2, "bookstoretime");
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