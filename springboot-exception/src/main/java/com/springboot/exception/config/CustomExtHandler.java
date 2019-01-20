package com.springboot.exception.config;

import com.springboot.exception.entity.MwException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MwMonster
 * @Description 异常处理类
 * @date 2019/1/20 11:31 PM
 */
@RestControllerAdvice
public class CustomExtHandler {

    /**
     * 全局异常类处理
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

    /**
     * 功能描述：处理自定义异常
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(value = MwException.class)
    Object handlerException(MwException e, HttpServletRequest request){

//        //返回json数据
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", e.getCode());
//        map.put("msg", e.getMsg());
//        map.put("url", request.getRequestURL());
//        return map;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg", e.getMsg());
        return modelAndView;
    }

}
