package com.book_online.demo.mapper;

import com.book_online.demo.model.BookType;
import com.book_online.demo.model.BookTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookTypeMapper {
    int deleteByExample(BookTypeExample example);

    int deleteByPrimaryKey(Integer booktypeid);

    int insert(BookType record);

    int insertSelective(BookType record);

    List<BookType> selectByExample(BookTypeExample example);

    BookType selectByPrimaryKey(Integer booktypeid);

    int updateByExampleSelective(@Param("record") BookType record, @Param("example") BookTypeExample example);

    int updateByExample(@Param("record") BookType record, @Param("example") BookTypeExample example);

    int updateByPrimaryKeySelective(BookType record);

    int updateByPrimaryKey(BookType record);
}