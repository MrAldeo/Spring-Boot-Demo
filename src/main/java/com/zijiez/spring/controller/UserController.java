package com.zijiez.spring.controller;


import com.zijiez.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String assetsSummary(){
       return "恭喜，登录成功！";
    }

    @RequestMapping(value="/transationTest",method= RequestMethod.GET)
    public String transationTest() throws Exception {
        userService.getUserInfo();
        return "恭喜，登录成功！";
    }
}
