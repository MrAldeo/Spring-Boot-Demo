package com.zijiez.spring.service;

import com.zijiez.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    @Autowired
//    UserDto userDto;//Dto是需要new的，因为这个值是变化的，需要我们传值。不想普通类是不变 的
    @Autowired
    UserDao userDto;

    /**
     * 查询用户信息
     * @return
     */
    public void getUserInfo() throws Exception {
        userDto.tranSationTest();
        userDto.tranSationTest2();
    }
}
