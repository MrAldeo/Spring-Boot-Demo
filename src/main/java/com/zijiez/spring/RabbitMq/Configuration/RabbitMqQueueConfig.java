package com.zijiez.spring.RabbitMq.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/15 17:18
 * @Email: zhangzj@vipcode.com
 * @Description: 队列配置，队列的名称，发送者和接受者的名称必须一致，否则接收不到消息(没有用exchange)
 */

@Configuration
public class RabbitMqQueueConfig {
    @Bean
    public Queue Queue1() {
        return new Queue("ZZJ_QUEUE");
    }

}
