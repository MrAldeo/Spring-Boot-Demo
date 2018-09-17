package com.zijiez.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by Aldeo on 2018/9/12.
 */
//Dao注解
@Repository
public class UserDao {
    public void tranSationTest() throws Exception {
        System.out.println("事物1");
        throw new Exception("方法执行错误");

    }

    public void tranSationTest2(){
        System.out.println("事物2");
    }
}
