package com.atguigu.eduservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EduApplication {
    public  static  void main(String[] args){
        SpringApplication.run(EduApplication.class,args);
    }
}
