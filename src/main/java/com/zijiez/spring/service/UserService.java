package com.zijiez.spring.service;

import com.zijiez.spring.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    /**
     * 查询用户信息
     * @return
     */
    public UserDto getUserInfo(){
        UserDto userDto = new UserDto();
        userDto.setUserName("Aldeo");
        userDto.setAge(18);
        return userDto;
    }
}
