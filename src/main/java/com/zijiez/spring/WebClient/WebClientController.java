package com.zijiez.spring.WebClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangzijie
 * @Date: 2019/9/25 16:43
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@RestController
@RequestMapping(("/webClient"))
public class WebClientController {
    @RequestMapping("/get")
    public String doGet(){
        return  WebClientUtil.testWithCookie();
    }
}
