package com.zijiez.spring.RabbitMq.Configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/17 14:44
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
//注意：====多个connfig配置exchange和queue的时候声明的名字不能相同，例如下面的：
// messageAck和queueMessageAxk和exchangeAck，以及bindingExchangeMessage中的命名否则后面的加入不到
//mq中
@Configuration
public class RabbitMqAckTestConfig {
    final static String messageAck = "ack.test";

    //Queue，构建队列，名称，是否持久化之类
    @Bean
    public Queue queueMessageAck() {
        return new Queue(RabbitMqAckTestConfig.messageAck);
    }

    @Bean
    TopicExchange exchangeAck() {
        //创建一个交换机
        //有四种交换机
        //Fanout exchange（扇型交换机）：fanout类型的Exchange路由规则非常简单，它会把所有发送到该Exchange的消息路由到所有与它绑定的Queue中
        //Topic exchange（主题交换机）：queue可以进行匹配
        //Direct exchange（直连交换机）：direct类型的Exchange路由规则也很简单，它会把消息路由到那些binding key与routing key完全匹配的Queue中
        //Headers exchange（头交换机）：headers类型的Exchange不依赖于routing key与binding key的匹配规则来路由消息，而是根据发送的消息内容中的headers属性进行匹配。
        return new TopicExchange("ackTestExchange");
    }

    //Binding，将DirectExchange与Queue进行绑定
    @Bean
    Binding bindingExchangeMessageAck(Queue queueMessageAck, TopicExchange exchangeAck) {
        return BindingBuilder.bind(queueMessageAck).to(exchangeAck).with("ack.test");
    }
}
