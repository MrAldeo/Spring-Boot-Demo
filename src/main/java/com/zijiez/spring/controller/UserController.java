package com.zijiez.spring.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String assetsSummary(){
       return "恭喜，登录成功！";
    }
}
