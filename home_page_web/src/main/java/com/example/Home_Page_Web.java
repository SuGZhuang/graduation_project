package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
public class Home_Page_Web {

    public static void main(String[] args) {
        SpringApplication.run(Home_Page_Web.class,args);
    }

}
