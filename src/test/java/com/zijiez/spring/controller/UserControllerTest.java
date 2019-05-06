package com.zijiez.spring.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * @author <a href="mailto:zzjjiayou@163.com">zhangzijie</a>
 * @version 1.0 2017/11/3 18:34.
 */
public class UserControllerTest {

    //引入MockMvc

    @Autowired

    private MockMvc mvc;
    @Test
    public void assetsSummary() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/login33"))

                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}