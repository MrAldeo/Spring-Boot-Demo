package com.zijiez.spring.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhangzijie
 * @Date: 2019/7/23 11:34
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class RestTemplateUtil {

    public static  JSONObject doGet(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<JSONObject> responseEntity =restTemplate.getForEntity(url,JSONObject.class);
        serverIsRight(responseEntity);   //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public static JSONObject doPostJson(JSONObject param,String url){
        RestTemplate restTemplate = new RestTemplate();
        //设置提交json格式数据
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<JSONObject> request = new HttpEntity<>(param, headers);
        ResponseEntity<JSONObject> responseEntity = restTemplate.postForEntity(url,request,JSONObject.class);
        serverIsRight(responseEntity);  //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public static JSONObject doPostForm(String param,String url){
        RestTemplate restTemplate = new RestTemplate();
        //设置表单提交
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("userName", param);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        ResponseEntity<JSONObject> responseEntity = restTemplate.postForEntity(url,request,JSONObject.class);
        serverIsRight(responseEntity);  //判断服务器返回状态码
        return responseEntity.getBody();
    }

    public static void serverIsRight(ResponseEntity responseEntity){
        if(responseEntity.getStatusCodeValue()==200){
            System.out.println("服务器请求成功：{}"+responseEntity.getStatusCodeValue());
        }else {
            System.out.println("服务器请求异常：{}"+responseEntity.getStatusCodeValue());
        }
    }

}
