package com.zijiez.spring.WebClient;

import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @Auther: zhangzijie
 * @Date: 2019/9/25 15:13
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class WebClientUtil {
    public static String testWithCookie(){
        Mono<String> resp = WebClient.create()
                .method(HttpMethod.GET)
                .uri("http://baidu.com")
                .cookie("token","xxxx")
                .cookie("JSESSIONID","XXXX")
                .retrieve()
                .bodyToMono(String.class);
//        LOGGER.info("result:{}",resp.block());
        System.out.println(resp.block());
        return resp.block();
    }
}
