package com.book_online.demo.controller;

import com.book_online.demo.service.BookService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BookController {
    @Resource
    private BookService bookService;

    @ResponseBody
    @RequestMapping(value = "/books")
    public PageInfo findBooks(int pageNum, int bookTypeId){
        int pageSize=8;
        PageInfo page = bookService.findAllBook(pageNum,pageSize, bookTypeId);
        return page;
    }
}
