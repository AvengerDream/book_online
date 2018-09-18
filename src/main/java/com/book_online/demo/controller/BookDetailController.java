package com.book_online.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookDetailController {

    @RequestMapping(value = "/BookDetail")
    public String name(){
        return "BookDetail";
    }

}
