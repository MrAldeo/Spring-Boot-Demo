package com.zijiez.spring.templates;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String login(@ModelAttribute User user){
        return "login";
    }

    @RequestMapping(value="/login/auth")
    public String loginAuth(ModelMap modelMap,@ModelAttribute User user){
        System.out.println("userName："+user.getUserName());
        System.out.println("password:"+user.getPassword());

        if(user.getUserName().equals("admin") && user.getPassword().equals("admin")){
            User userRe = new User();
            userRe.setUserName(user.getUserName());
            userRe.setPassword(user.getPassword());
            //单个数据
            modelMap.put("pageName", "登陆成功");
            //将实体数据传到页面
            modelMap.put("userInfo", userRe);
            return "/index";
        }else {
            modelMap.put("pageName", "用户名或密码错误，登陆失败");
            return "/err";
        }

    }
}
