package com.zijiez.spring.templates;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: zhangzijie
 * @Date: 2019/3/8 14:50
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login")
    public String assetsSummary(){
        return "index";
    }
}
