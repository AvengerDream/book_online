package com.book_online.demo.model;

public class ShopBook extends ShopBookKey {
    private Integer ordermount;

    private Double price;

    private String ispay;

    public Integer getOrdermount() {
        return ordermount;
    }

    public void setOrdermount(Integer ordermount) {
        this.ordermount = ordermount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIspay() {
        return ispay;
    }

    public void setIspay(String ispay) {
        this.ispay = ispay == null ? null : ispay.trim();
    }
}