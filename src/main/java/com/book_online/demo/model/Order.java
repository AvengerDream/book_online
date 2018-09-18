package com.book_online.demo.model;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer ordermount;

    private String orderid;

    private Integer customerid;

    private Date orderdate;

    private Integer bookid;

    private String recevername;

    private String receveraddr;

    private String memo;

    private Double totalprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public Integer getOrdermount() {
        return ordermount;
    }

    public void setOrdermount(Integer ordermount) {
        this.ordermount = ordermount;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getRecevername() {
        return recevername;
    }

    public void setRecevername(String recevername) {
        this.recevername = recevername == null ? null : recevername.trim();
    }

    public String getReceveraddr() {
        return receveraddr;
    }

    public void setReceveraddr(String receveraddr) {
        this.receveraddr = receveraddr == null ? null : receveraddr.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderid='" + orderid + '\'' +
                ", customerid=" + customerid +
                ", orderdate=" + orderdate +
                ", bookid=" + bookid +
                ", recevername='" + recevername + '\'' +
                ", receveraddr='" + receveraddr + '\'' +
                ", memo='" + memo + '\'' +
                ", totalprice=" + totalprice +
                '}';
    }
}