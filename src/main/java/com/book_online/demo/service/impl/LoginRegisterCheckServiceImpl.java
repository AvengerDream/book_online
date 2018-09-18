package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.CustomerInfoMapper;
import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.service.LoginRegisterCheckService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "loginRegisterCheckService")
public class LoginRegisterCheckServiceImpl implements LoginRegisterCheckService {
    @Resource
    CustomerInfoMapper customerInfoMapper;

    public String LoginRegisterCheck(String username) {
        CustomerInfo customerInfo = customerInfoMapper.selectByCustomerName(username);
        String result;
        if (customerInfo==null){
            result="not exist";
        }
        else {
            result="exist";
        }
        return result;
    }
}
