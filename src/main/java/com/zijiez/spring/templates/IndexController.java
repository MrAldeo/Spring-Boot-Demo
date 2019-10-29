package com.zijiez.spring.templates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: zhangzijie
 * @Date: 2019/9/26 16:15
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap map){
        //单个数据
        map.put("username", "入门案例");

        User user = new User();
        user.setPassword("test_ps");
        user.setUserName("test");

        map.put("userInfo", user);
        return "/index";
    }
}
