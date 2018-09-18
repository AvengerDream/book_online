package com.book_online.demo.service;

import com.book_online.demo.model.CustomerInfo;

public interface CustomerInfoService {
    String delcustomer(Integer customerid);
    CustomerInfo findCustomer(String customername);
    String update(CustomerInfo customerinfo);
}
