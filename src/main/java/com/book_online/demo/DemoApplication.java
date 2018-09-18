package com.book_online.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.book_online.demo.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        /**
         *　　　　　　　 ┏┓       ┏┓+ +
         *　　　　　　　┏┛┻━━━━━━━┛┻┓ + +
         *　　　　　　　┃　　　　　　 ┃
         *　　　　　　　┃　　　━　　　┃ ++ + + +
         *　　　　　　 █████━█████  ┃+
         *　　　　　　　┃　　　　　　 ┃ +
         *　　　　　　　┃　　　┻　　　┃
         *　　　　　　　┃　　　　　　 ┃ + +
         *　　　　　　　┗━━┓　　　 ┏━┛
         *               ┃　　  ┃
         *　　　　　　　　　┃　　  ┃ + + + +
         *　　　　　　　　　┃　　　┃　Code is far away from     bug with the animal protecting
         *　　　　　　　　　┃　　　┃ + 　　　　         神兽保佑,代码无bug
         *　　　　　　　　　┃　　　┃
         *　　　　　　　　　┃　　　┃　　+
         *　　　　　　　　　┃　 　 ┗━━━┓ + +
         *　　　　　　　　　┃ 　　　　　┣┓
         *　　　　　　　　　┃ 　　　　　┏┛
         *　　　　　　　　　┗┓┓┏━━━┳┓┏┛ + + + +
         *　　　　　　　　　 ┃┫┫　 ┃┫┫
         *　　　　　　　　　 ┗┻┛　 ┗┻┛+ + + +
         */

        SpringApplication.run(DemoApplication.class, args);
    }
}
