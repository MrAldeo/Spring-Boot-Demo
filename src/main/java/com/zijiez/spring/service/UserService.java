package com.zijiez.spring.service;

import com.zijiez.spring.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDto userDto;

    /**
     * 查询用户信息
     * @return
     */
    public UserDto getUserInfo(){
        userDto.setUserName("Aldeo");
        userDto.setAge(18);
        return userDto;
    }
}
