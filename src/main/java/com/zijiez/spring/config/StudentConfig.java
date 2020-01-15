package com.zijiez.spring.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Auther: zhangzijie
 * @Date: 2020/1/15 11:16
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "student")
public class StudentConfig {
    private String user_name;
    private Map address;
    private String[] ages;
}
