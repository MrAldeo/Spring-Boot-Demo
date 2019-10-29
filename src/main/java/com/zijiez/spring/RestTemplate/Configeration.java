package com.zijiez.spring.RestTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhangzijie
 * @Date: 2019/9/25 16:07
 * @Email: zhangzj@vipcode.com
 * @Description:  用以注册bean到上下文
 */
@Configuration
public class Configeration {
     //    springbot1.0设置超时时间
//	@Bean
//	public RestTemplate restTemplate() {
//		//设置RestTemplate超时时间
//		HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//		httpRequestFactory.setConnectionRequestTimeout(8000);
//		httpRequestFactory.setConnectTimeout(8000);
//		httpRequestFactory.setReadTimeout(8000);
//		return new RestTemplate(httpRequestFactory);
//	}


    //springboot2.0设置超时时间
    @Bean
    public RestTemplate restTemplate() {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        requestFactory.setReadTimeout(3000);
        return new RestTemplate(requestFactory);
    }
}
