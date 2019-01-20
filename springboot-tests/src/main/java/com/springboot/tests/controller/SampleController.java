package com.springboot.tests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/20 10:45 PM
 */

@RestController
public class SampleController {


    @GetMapping("/v1/hello")
    public Object hello(){
        return "mw_monster";
    }
}
