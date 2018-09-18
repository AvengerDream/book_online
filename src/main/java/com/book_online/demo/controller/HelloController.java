package com.book_online.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/name")
    public String name() {
        System.out.println("============================================");
        return "Hello.jsp";
    }

}

