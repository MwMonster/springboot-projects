package com.springboot.catalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/19 10:28 PM
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public Object hello(){
        return "hello";
    }
}
