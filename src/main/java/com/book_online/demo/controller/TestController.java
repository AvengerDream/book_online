package com.book_online.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/hi")
    public String sayHello(){
        return "login";

    }

}
