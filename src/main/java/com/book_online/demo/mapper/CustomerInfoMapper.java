package com.book_online.demo.mapper;

import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.model.CustomerInfoExample;
import com.book_online.demo.model.CustomerInfoKey;
import com.book_online.demo.model.CustomerLoginInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerInfoMapper {
    int deleteByExample(CustomerInfoExample example);

    int deleteByPrimaryKey(CustomerInfoKey key);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    List<CustomerInfo> selectByExample(CustomerInfoExample example);

    CustomerInfo selectByPrimaryKey(CustomerInfoKey key);

    int updateByExampleSelective(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    int updateByExample(@Param("record") CustomerInfo record, @Param("example") CustomerInfoExample example);

    CustomerInfo selectByCustomerName(String customerName);

    CustomerInfo findLoginUser(CustomerLoginInfo info);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    int delCustomerInfo(Integer customerid);
}