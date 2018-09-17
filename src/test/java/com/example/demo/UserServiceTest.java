package com.example.demo;

import com.zijiez.spring.dto.UserDto;
import com.zijiez.spring.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)   //表明要在测试环境跑了，底层使用的junit测试工具
@SpringBootTest      //将启动整个spring的工程
public class UserServiceTest {
    @Autowired
    UserService userService;  //注入UserService

    @Test   //加test注解
    public void getUserInfo() {
        //UserDto userDto = userService.getUserInfo();
        //Assert.assertEquals(18,userDto.getAge());
    }
}
