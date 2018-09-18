package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.CustomerInfoMapper;
import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.service.CustomerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "customerInfoService")
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Resource
    CustomerInfoMapper customerInfoMapper;
    @Override
    public String delcustomer(Integer customerid) {
       int result =  customerInfoMapper.delCustomerInfo(customerid);
       if(result==1){
           return "删除成功";
       }
       else{
           return "删除失败";
       }

    }

    @Override
    public CustomerInfo findCustomer(String customername) {
        CustomerInfo customerInfo = customerInfoMapper.selectByCustomerName(customername);
        return customerInfo;
    }

    @Override
    public String update(CustomerInfo customerinfo) {
        int result  = customerInfoMapper.updateByPrimaryKey(customerinfo);
        if(result==1){
            return "修改成功";
        }
        else{
            return "修改失败";
        }
    }
}
