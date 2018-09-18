package com.book_online.demo.model;

import java.util.Date;

public class CustomerInfo extends CustomerInfoKey {
    private String customerpwd;

    private String customertruename;

    private String customersex;

    private String customertel;

    private String customeremail;

    private String customeraddr;

    private Date customerregtime;

    private String customerques;

    private String customeranswer;

    private Integer customerlogtime;

    private Date customerlastlogt;

    public String getCustomerpwd() {
        return customerpwd;
    }

    public void setCustomerpwd(String customerpwd) {
        this.customerpwd = customerpwd == null ? null : customerpwd.trim();
    }

    public String getCustomertruename() {
        return customertruename;
    }

    public void setCustomertruename(String customertruename) {
        this.customertruename = customertruename == null ? null : customertruename.trim();
    }

    public String getCustomersex() {
        return customersex;
    }

    public void setCustomersex(String customersex) {
        this.customersex = customersex == null ? null : customersex.trim();
    }

    public String getCustomertel() {
        return customertel;
    }

    public void setCustomertel(String customertel) {
        this.customertel = customertel == null ? null : customertel.trim();
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail == null ? null : customeremail.trim();
    }

    public String getCustomeraddr() {
        return customeraddr;
    }

    public void setCustomeraddr(String customeraddr) {
        this.customeraddr = customeraddr == null ? null : customeraddr.trim();
    }

    public Date getCustomerregtime() {
        return customerregtime;
    }

    public void setCustomerregtime(Date customerregtime) {
        this.customerregtime = customerregtime;
    }

    public String getCustomerques() {
        return customerques;
    }

    public void setCustomerques(String customerques) {
        this.customerques = customerques == null ? null : customerques.trim();
    }

    public String getCustomeranswer() {
        return customeranswer;
    }

    public void setCustomeranswer(String customeranswer) {
        this.customeranswer = customeranswer == null ? null : customeranswer.trim();
    }

    public Integer getCustomerlogtime() {
        return customerlogtime;
    }

    public void setCustomerlogtime(Integer customerlogtime) {
        this.customerlogtime = customerlogtime;
    }

    public Date getCustomerlastlogt() {
        return customerlastlogt;
    }

    public void setCustomerlastlogt(Date customerlastlogt) {
        this.customerlastlogt = customerlastlogt;
    }
}