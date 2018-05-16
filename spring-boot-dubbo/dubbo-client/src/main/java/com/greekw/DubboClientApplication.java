package com.greekw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author:wuwc
 * @Description:
 * @Date:2018/5/16 18:47
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class DubboClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboClientApplication.class,args);
    }
}
