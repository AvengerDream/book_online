package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.CustomerInfoMapper;
import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.model.CustomerLoginInfo;
import com.book_online.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    CustomerInfoMapper customerInfoMapper;
    public Object Login (String username,String password) throws Exception{
        CustomerInfo customerInfo=null;
        String password_md5="";
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(password.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            password_md5 =  new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            password_md5="加密错误";
        }
        finally {
            if (password_md5.length()==32){
                CustomerLoginInfo info = new CustomerLoginInfo();
                info.setCustomerPassword(password_md5);
                info.setCustomerName(username);
                customerInfo = customerInfoMapper.findLoginUser(info);
            }
            else{
                return customerInfo;
            }
        }
        return customerInfo;
    }
}
