package com.book_online.demo.mapper;

import com.book_online.demo.model.ShopBook;
import com.book_online.demo.model.ShopBookExample;
import com.book_online.demo.model.ShopBookKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBookMapper {
    int deleteByExample(ShopBookExample example);

    int deleteByPrimaryKey(ShopBookKey key);

    int insert(ShopBook record);

    int insertSelective(ShopBook record);

    List<ShopBook> selectByExample(ShopBookExample example);

    ShopBook selectByPrimaryKey(ShopBookKey key);

    int updateByExampleSelective(@Param("record") ShopBook record, @Param("example") ShopBookExample example);

    int updateByExample(@Param("record") ShopBook record, @Param("example") ShopBookExample example);

    int updateByPrimaryKeySelective(ShopBook record);

    int updateByPrimaryKey(ShopBook record);
}