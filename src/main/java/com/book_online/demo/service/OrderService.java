package com.book_online.demo.service;

import com.book_online.demo.model.Order;
import com.github.pagehelper.PageInfo;

public interface OrderService {
    Order findorder(Integer orderid);
    String delorder(Integer orderid);
    PageInfo<Order> findmyorder(Integer customerId,Integer pageNum);
}
