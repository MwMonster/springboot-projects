package com.springboot.json.controller;

import com.springboot.json.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/19 5:34 PM
 */
@RestController
public class JsonController {


    @GetMapping(value = "/v1/test_json")
    public Object testJson(){
        User user = new User();
        user.setId(11);
        user.setPassword("123456");
        user.setBirthday(new Date());
        return user;
    }
}
