package com.zijiez.spring.controller;


import com.alibaba.fastjson.JSONObject;
import com.zijiez.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/user/login")
    public Map assetsSummary() throws InterruptedException {
//        Thread.sleep(5000);
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "恭喜，登录成功！");
       return map;
    }

    @RequestMapping(value="/user/json/login")
    public void userJsonLogin(@RequestBody JSONObject jsonObject) throws InterruptedException {
        System.out.println("请求参数："+jsonObject);
    }

    @RequestMapping(value="/user/form/login")
    public void userFormLogin(HttpServletRequest request) throws InterruptedException {
        System.out.println("请求参数："+request.getParameter("userName"));
    }

    @RequestMapping(value="/transationTest",method= RequestMethod.GET)
    public String transationTest() throws Exception {
        userService.getUserInfo();
        return "恭喜，登录成功！";
    }
}
