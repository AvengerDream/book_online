package com.book_online.demo.service.impl;

import com.book_online.demo.mapper.BookMapper;
import com.book_online.demo.model.Book;
import com.book_online.demo.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    public PageInfo<Book> findAllBook(int pageNum, int pageSize,int bookTypeId){
        PageHelper.startPage(pageNum, pageSize);
        List<Book> list = bookMapper.findAllBook(bookTypeId);
        PageInfo<Book> pageInfo = new PageInfo<>(list);
        return pageInfo;

    }

    public PageInfo<Book> adminFindBook(int pageNum,int bookTypeId,String bookName){
        PageHelper.startPage(pageNum,8);
        List<Book> list = bookMapper.adminFindBook(bookTypeId,bookName);
        PageInfo<Book> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public String  adminAddbook(Book book){
        int result = bookMapper.insertSelective(book);
        if(result==1){
            return "添加成功";
        }
        else{
            return "添加失败";
        }
    }
    public String  admindelbook(int bookid){
        int result = bookMapper.deleteByPrimaryKey(bookid);
        if (result==1){
            return "删除成功";
        }
        else{
            return "删除异常或书籍不存在";
        }

    }

    @Override
    public String updatebook(int bookid, int bookstoremount,String bookstoretime) {
        Book book = new Book();
        book.setBookid(bookid);
        book.setBookstoremount(bookstoremount);
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            date = sdf.parse(bookstoretime);
            book.setBookstoretime(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = bookMapper.updateByPrimaryKey(book);
        if (result==1){
            return "更新成功";
        }
        else{
            return "更新失败";
        }
    }

}
