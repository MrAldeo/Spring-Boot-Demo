package com.zijiez.spring.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangzijie
 * @Date: 2019/7/23 14:48
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@RestController
@RequestMapping(("/restTemplate"))
public class RestTemplateController {
//    @Autowired
//    RestTemplateUtil restTemplateUtil;

    @RequestMapping("/get")
    public JSONObject doGet(){
        return  RestTemplateUtil.doGet("http://127.0.0.1:8003/user/login");
    }

    @RequestMapping("/doPostJson")
    public JSONObject doPostJson(){
        JSONObject param = new JSONObject();
        param.put("userName","张三");
        return  RestTemplateUtil.doPostJson(param,"http://127.0.0.1:8003/user/json/login");
    }

    @RequestMapping("/doPostForm")
    public JSONObject doPostForm(){
        return  RestTemplateUtil.doPostForm("表单请求参数哦","http://127.0.0.1:8003/user/form/login");
    }
}
