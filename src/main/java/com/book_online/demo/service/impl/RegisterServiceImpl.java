package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.CustomerInfoMapper;
import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service(value = "registerService")
public class RegisterServiceImpl implements RegisterService {

    @Resource
    CustomerInfoMapper customerInfoMapper;

    public String register(CustomerInfo customerInfo) throws NoSuchAlgorithmException {
        String password_md5;
        String password = customerInfo.getCustomerpwd();
        // 生成一个MD5加密计算摘要
        MessageDigest md = MessageDigest.getInstance("MD5");
        // 计算md5函数
        md.update(password.getBytes());
        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
        password_md5=  new BigInteger(1, md.digest()).toString(16);
        customerInfo.setCustomerpwd(password_md5);
        int result = customerInfoMapper.insertSelective(customerInfo);
        if (result==1){
            return "1";
        }
        else{
            return "2";
        }
    }
}

