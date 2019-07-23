package com.zijiez.spring.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhangzijie
 * @Date: 2019/7/23 11:34
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Service
public class RestTemplateUtil {
    @Autowired
    RestTemplate restTemplate;

    public JSONObject doGet(){
        ResponseEntity<JSONObject> responseEntity =restTemplate.getForEntity("http://baidu.com",JSONObject.class);
        serverIsRight(responseEntity);   //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public JSONObject doPost(JSONObject param){
        ResponseEntity<JSONObject> responseEntity = restTemplate.postForEntity("http://baidu.com",param,JSONObject.class);
        serverIsRight(responseEntity);  //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public void serverIsRight(ResponseEntity responseEntity){
        if(responseEntity.getStatusCodeValue()==200){
            System.out.println("服务器请求成功：{}"+responseEntity.getStatusCodeValue());
        }else {
            System.out.println("服务器请求异常：{}"+responseEntity.getStatusCodeValue());
        }
    }

}
