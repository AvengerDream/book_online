package com.book_online.demo.mapper;

import com.book_online.demo.model.Book;
import com.book_online.demo.model.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(Integer bookid);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    List<Book> findAllBook(@Param("bookTypeId") int bookTypeId);

    int updateByPrimaryKey(Book record);

    List<Book> adminFindBook(Integer bookTypeId,String bookName);
}