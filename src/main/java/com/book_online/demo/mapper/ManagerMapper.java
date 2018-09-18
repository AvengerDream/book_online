package com.book_online.demo.mapper;

import com.book_online.demo.model.Manager;
import com.book_online.demo.model.ManagerExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {
    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager adminLogin(String adminName);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}