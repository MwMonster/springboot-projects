package com.springboot.http.controller;

import com.springboot.http.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MwMonster
 * @Description Get请求
 * @date 2019/1/19 10:42 AM
 */
//RestController相当于是Controller+ResponseBody
@RestController
public class HttpController {

    private Map<String, Object> params = new HashMap<>();

    /**
     * 功能描述：测试resuful协议，从路径中获取字段
     * 测试地址 http://localhost:8080/abc/def
     * @param cityId
     * @param userId
     * @return
     */
    @RequestMapping(path = "/{city_id}/{user_id}", method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId,
                           @PathVariable("user_id") String userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }

    /**
     * 功能描述：测试GetMapping
     * 测试地址：localhost:8080/v1/test_get1?from=12&size=23
     * @param from
     * @param size
     * @return
     */
    @GetMapping(value = "/v1/test_get1")
    public Object testGetMapping(int from, int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);
        return params;
    }

    /**
     * 功能描述：默认值，是否必须的参数
     * 测试地址：1.不传page参数：localhost:8080/v1/test_get2?size=23
     *         2.给page参数赋值：localhost:8080/v1/test_get2?size=23&page=2
     * @param from
     * @param size
     * @return
     */
    @GetMapping(value = "/v1/test_get2")
    public Object testGetMapping2(@RequestParam(defaultValue = "0", name = "page") int from, int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);
        return params;
    }

    /**
     * 功能描述：bean对象传参
     * 注意：1.注意需要指定http头为content-type为application/json
     *      2.使用body传输数据
     *      3.该方法是post方式测试
     *      TODO 传输有date类型的对象，还没有找到解决方法
     * @param user
     * @return
     */
    @RequestMapping(value = "/v1/save_user")
    public Object testGetMapping3(@RequestBody User user){
        params.clear();
        params.put("user", user);
        return params;
    }

    /**
     * 功能描述：测试获取http头信息
     * 测试路径： localhost:8080/v1/get_header?id=154545
     *          在Headers中添加key为access_token的键值对
     * @param accessToken
     * @param id
     * @return
     */
    @GetMapping("/v1/get_header")
    public Object getHeader(@RequestHeader("access_token") String accessToken, String id){
        params.clear();
        params.put("access_token", accessToken);
        params.put("id", id);
        return params;
    }

    /**
     * 测试HttpServletRequest
     * 测试地址：localhost:8080/v1/test_request?id=154545
     * @param request
     * @return
     */
    @GetMapping(value = "/v1/test_request")
    public Object testRequest(HttpServletRequest request){
        params.clear();
        String id = request.getParameter("id");
        params.put("id", id);
        return params;
    }


    /**
     * 功能描述：测试PostMapping
     * @param id
     * @param pwd
     * @return
     */
    @PostMapping(value = "/v1/test_post")
    public Object testPost(String id, String pwd){
        params.clear();
        params.put("id", id);
        params.put("pwd", pwd);
        return pwd;
    }

    /**
     * 功能描述：测试PutMapping
     * @param id
     * @return
     */
    @PutMapping(value = "/v1/test_put")
    public Object testPut(String id){
        params.clear();
        params.put("id", id);
        return params;
    }

    /**
     * 功能描述：测试DeleteMapping
     * @param id
     * @return
     */
    @DeleteMapping(value = "/v1/test_del")
    public Object testDelete(String id){
        params.clear();
        params.put("id", id);
        return params;
    }
}
