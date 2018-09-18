package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.ManagerMapper;
import com.book_online.demo.model.Manager;
import com.book_online.demo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "adminService")
public class AdminServiceImpl implements AdminService {
    @Resource
    ManagerMapper managerMapper;

    @Override
    public String  adminLogin(String username, String password) {
        String result;

        Manager manager= managerMapper.adminLogin(username);
        if(manager==null){
            return "账户不存在";
        }
        if(password.equals(manager.getAdminpwd())){
            result="success";
        }
        else{
            result="密码错误";
        }
        return result;
    }
}
