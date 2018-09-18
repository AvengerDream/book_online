package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.OrderMapper;
import com.book_online.demo.model.Order;
import com.book_online.demo.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;

    public Order findorder(Integer orderid) {

        Order order = orderMapper.selectByPrimaryKey(orderid);
        System.out.println(order);
        return order;
    }

    @Override
    public String delorder(Integer orderid) {
        int result = orderMapper.deleteByPrimaryKey(orderid);
        if (result==1){
            return "删除订单成功";
        }
        else{
            return "删除失败，请确认订单号正确";
        }
    }

    @Override
    public PageInfo<Order> findmyorder(Integer customerId,Integer pageNum) {
        System.out.println(pageNum);
        PageHelper.startPage(pageNum,8);
        List<Order> list = orderMapper.selectByCustomerId(customerId);
        PageInfo<Order> page = new PageInfo<>(list);
        return page;
    }
}
