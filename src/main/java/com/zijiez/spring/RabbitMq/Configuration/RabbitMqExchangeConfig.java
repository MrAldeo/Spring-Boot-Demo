package com.zijiez.spring.RabbitMq.Configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/15 17:31
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Configuration
public class RabbitMqExchangeConfig {
    //只接一个topic
    final static String message = "topic.message";
    //接收多个topic
    final static String messages = "topic.messages";

    @Bean
    public Queue queueMessage() {
        return new Queue(RabbitMqExchangeConfig.message);
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(RabbitMqExchangeConfig.messages);
    }

    @Bean
    TopicExchange exchange() {
        //创建一个交换机
        //有四种交换机
        //Fanout exchange（扇型交换机）：fanout类型的Exchange路由规则非常简单，它会把所有发送到该Exchange的消息路由到所有与它绑定的Queue中
        //Topic exchange（主题交换机）：queue可以进行匹配
        //Direct exchange（直连交换机）：direct类型的Exchange路由规则也很简单，它会把消息路由到那些binding key与routing key完全匹配的Queue中
        //Headers exchange（头交换机）：headers类型的Exchange不依赖于routing key与binding key的匹配规则来路由消息，而是根据发送的消息内容中的headers属性进行匹配。
        return new TopicExchange("exchange");
    }

    //配置路由
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        //这里的#表示零个或多个词。
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }

}
