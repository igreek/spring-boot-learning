package com.greekw.test.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuwc on 2017/7/3.
 */

@RestController
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/hello")
    //@ResponseBody
    public String sayHello(){
        return "Hello World!";
    }

}
