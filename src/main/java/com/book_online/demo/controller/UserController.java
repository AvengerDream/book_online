package com.book_online.demo.controller;

import com.book_online.demo.model.CustomerInfo;
import com.book_online.demo.service.*;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Resource
    LoginService loginService;
    @Resource
    RegisterService registerService;
    @Resource
    LoginRegisterCheckService loginRegisterCheckService;
    @Resource
    AdminService adminService;
    @Resource
    CustomerInfoService customerInfoService;
    @Resource
    OrderService orderService;
    @RequestMapping(value = "logintest")
    public String loginTest(){return "login";
    }
    @RequestMapping("/login/info")
    @ResponseBody
    public Map<String,Object> LoginInfo(HttpServletRequest request, HttpSession session) throws Exception {
        Model model;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        CustomerInfo customerInfo = (CustomerInfo) loginService.Login(username,password);

        Map<String,Object> map = new HashMap<>();
        if(customerInfo!=null){
            String customerid = customerInfo.getCustomerid().toString();
            String customername = customerInfo.getCustomername();
            session.setAttribute("customerInfo",customerInfo);
            map.put("message","success");
            map.put("customerId",customerid);
            map.put("customerName",customername);
            map.put("customerInfo",session.getAttribute("customerInfo"));
        }
        else{
            map.put("message","error");
        }
        return map;
    }
    @RequestMapping(value = "/register")
    @ResponseBody
    public String Register(
            @RequestParam("username")String username,
            @RequestParam("password")String password,
            @RequestParam("sex")String sex,
            @RequestParam("tel")String tel,
            @RequestParam("email")String email) throws Exception {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setCustomeremail(email);
        customerInfo.setCustomerpwd(password);
        customerInfo.setCustomername(username);
        customerInfo.setCustomersex(sex);
        customerInfo.setCustomertel(tel);
        //用户注册时间
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        customerInfo.setCustomerregtime(day);
        String result = registerService.register(customerInfo);
        return  result;
    }
    @RequestMapping(value = "/check")
    @ResponseBody
    public String LoginRegisterCheck(@RequestParam("username") String username){
        String result = loginRegisterCheckService.LoginRegisterCheck(username);
        return result;
    }

    @RequestMapping(value = "/customercenter")
    public String customerCenter(String customername, Model model){
        CustomerInfo customerInfo = customerInfoService.findCustomer(customername);
        model.addAttribute("customername",customername);
        model.addAttribute("customertruename",customerInfo.getCustomertruename());
        model.addAttribute("customersex",customerInfo.getCustomersex());
        model.addAttribute("customertel",customerInfo.getCustomertel());
        model.addAttribute("customeremail",customerInfo.getCustomeremail());
        model.addAttribute("customeraddr",customerInfo.getCustomeraddr());
        model.addAttribute("customeregtime",customerInfo.getCustomerregtime().toString());
        model.addAttribute("customerlastlogin",customerInfo.getCustomerlastlogt().toString());
        model.addAttribute("customername",customername);
        return "CustomerCenter";
    }

    @RequestMapping(value = "/updateinfo")
    @ResponseBody
    public String updateinfo(String tel,String email,String addr,String ques,String answer,String name){
        CustomerInfo customerInfo = customerInfoService.findCustomer(name);
        customerInfo.setCustomertel(tel);
        customerInfo.setCustomeremail(email);
        customerInfo.setCustomeraddr(addr);
        customerInfo.setCustomerques(ques);
        customerInfo.setCustomeranswer(answer);
        String  result = customerInfoService.update(customerInfo);
        return result;
    }


    @RequestMapping(value = "/adminlogin")
    public String AdminLogin(){
        return "adminlogin";
    }

    @RequestMapping(value = "/admininfo")
    @ResponseBody
    public String adminInfo(@RequestParam("username")String username,@RequestParam("password")String password){
        String result = adminService.adminLogin(username,password);
        return result;
    }

    @RequestMapping(value = "/adminindex")
    public String adminIndex(String username,Model model){
        model.addAttribute("adminname",username);
        return "adminindex";
    }


    @RequestMapping(value = "findmyorder")
    @ResponseBody
    public PageInfo findMyOrder(Integer customerId,Integer pageNum){
        PageInfo page = orderService.findmyorder(customerId,pageNum);
        return page;
    }
}
