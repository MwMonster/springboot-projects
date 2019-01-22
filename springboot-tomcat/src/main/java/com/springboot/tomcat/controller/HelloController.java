package com.springboot.tomcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/21 8:58 PM
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Object hello(){
        return "Hello World!";
    }
}
