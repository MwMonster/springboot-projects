package com.springboot.freemarker.controller;

import com.springboot.freemarker.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/23 12:07 AM
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping(value = "/index")
    public String index(ModelMap modelMap){
        User user = new User();

        user.setName("mw_monster");
        user.setAge(24);
        modelMap.addAttribute("user",user);
        System.out.println(modelMap);
        return "user/user";
    }
}

