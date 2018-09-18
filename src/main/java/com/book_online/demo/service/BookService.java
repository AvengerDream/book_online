package com.book_online.demo.service;

import com.book_online.demo.model.Book;
import com.github.pagehelper.PageInfo;

public interface BookService {
    PageInfo<Book> findAllBook(int pageNum, int pageSize,int bookTypeId);
    PageInfo<Book> adminFindBook(int pageNum,int bookTypeId,String bookName);
    String admindelbook(int bookid);
    String adminAddbook(Book book);
    String updatebook(int bookid,int bookstoremount,String bookstoretime);
}
