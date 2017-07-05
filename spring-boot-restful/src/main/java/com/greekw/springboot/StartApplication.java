package com.greekw.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wuwc on 2017/7/3.
 */
@SpringBootApplication
@MapperScan("com.greekw.springboot.mapper")
public class StartApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);
    }
}
