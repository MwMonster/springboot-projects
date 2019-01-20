package com.springboot.exception.controller;

import com.springboot.exception.entity.MwException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/20 11:22 PM
 */
@RestController
public class TestController {


    @GetMapping(value = "/v1/test_exception")
    public Object hello(){

        int i = 1/0;
        return "Hello World!";
    }


    @GetMapping(value = "/v1/test_mw_exception")
    public Object testMwException(){
        throw new MwException("408", "mw exception");
    }
}
