package com.book_online.demo.controller;

import com.book_online.demo.model.Book;
import com.book_online.demo.model.Order;
import com.book_online.demo.service.BookService;
import com.book_online.demo.service.CustomerInfoService;
import com.book_online.demo.service.ManagerService;
import com.book_online.demo.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Resource
    BookService bookService;
    @Resource
    OrderService orderService;
    @Resource
    CustomerInfoService customerInfoService;
    @Resource
    ManagerService managerService;
    @ResponseBody
    @RequestMapping(value = "/findbook")
    public PageInfo  findbook(Integer bookTypeId,String bookName){
        int pageNum=1;
        //pageHelper
        PageInfo page = bookService.adminFindBook(pageNum,bookTypeId,bookName);
        return page;
    }
    @RequestMapping(value = "/addbook")
    @ResponseBody
    public String addbook(Integer booktypeid, String bookname, String bookpress, String bookpubdate,
                          String bookauthor, Double bookprice,Integer bookpages,String bookoutline,
                        String bookpic,Integer bookstoremount,String bookstoretime){
        Book book = new Book();
        book.setBooktypeid(booktypeid);
        book.setBookname(bookname);
        book.setBookpress(bookpress);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(bookpubdate);
            book.setBookpubdate(date);
        } catch (ParseException e) {
            return "出库时间错误";
        }

        book.setBookauthor(bookauthor);
        book.setBookprice(bookprice);
        book.setBookpages(bookpages);
        book.setBookoutline(bookoutline);
        book.setBookpic(bookpic);
        book.setBookstoremount(bookstoremount);
        try {
            Date date = sdf.parse(bookstoretime);
            book.setBookstoretime(date);
        } catch (ParseException e) {
            return "入库时间格式错误";
        }
        String result = bookService.adminAddbook(book);
        return result;
    }
    @RequestMapping(value = "/delbook")
    @ResponseBody
    public String  delbook(Integer bookid){
        String   result = bookService.admindelbook(bookid);
        System.out.println(result);
        return result;
    }

    @RequestMapping(value = "/updatebook")
    @ResponseBody
    public String updatebook(Integer bookid,Integer bookstoremount,String bookstoretime){
        String result = bookService.updatebook(bookid,bookstoremount,bookstoretime);
        return result;
    }

    @RequestMapping(value = "/findorder")
    @ResponseBody
    public Map<String ,Object> findorder(int orderid){
        Map map = new HashMap();
        System.out.println(orderid);
        Order order = orderService.findorder(orderid);
        System.out.println(order);
        if (order==null){
            map.put("message","error");
        }
        else{
            map.put("message",order);
        }
        return  map;
    }

    @RequestMapping(value = "delorder")
    @ResponseBody
    public String dekorder(Integer orderid){
        String result = orderService.delorder(orderid);
        return result;
    }

    @RequestMapping(value = "delcustomer")
    @ResponseBody
    public String delcustomer(Integer customerid){
        String result = customerInfoService.delcustomer(customerid);
        return result;
    }

    @RequestMapping(value = "addmanager")
    @ResponseBody
    public String addmanager(String adminname,String adminpass){
        String result = managerService.addManager(adminname,adminpass);
        return result;
    }

    @RequestMapping(value = "updateadmin")
    @ResponseBody
    public String updateadmin(String adminpass,String adminname){
        String result = managerService.updateadminpass(adminpass,adminname);
        return result;
    }
}
