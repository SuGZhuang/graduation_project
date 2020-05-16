package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableDubbo
@MapperScan("com.example.homepage.dao")
public class Home_Page_Service {

    public static void main(String[] args) {
        SpringApplication.run(Home_Page_Service.class,args);
    }

}
