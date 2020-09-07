package com.itheima.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itheima.springboot.dao")
public class SpringbootDemo04Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo04Application.class, args);
    }

}
