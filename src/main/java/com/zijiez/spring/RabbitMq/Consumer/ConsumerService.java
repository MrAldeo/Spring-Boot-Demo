package com.zijiez.spring.RabbitMq.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/15 17:03
 * @Email: zhangzj@vipcode.com
 * @Description: 消息消费者没有使用exchange
 */
@Component
public class ConsumerService {
    /******************根据queue接收消息*************************/
    @RabbitListener(queues = "ZZJ_QUEUE")
    public void handleMessage(String data) {
        System.out.println("Received Message : " + data);
    }

    @RabbitListener(queues = "ZZJ_QUEUE")
    public void handleMessage2(String data) {
        System.out.println("Received2 Message : " + data);
    }

    /******************根据exchange路由接收消息*************************/
    @RabbitListener(queues = "topic.message")
    public void handleMessage3(String data) {
        System.out.println("topic.message接收到的消息 : " + data);
    }

    @RabbitListener(queues = "topic.messages")
    public void handleMessage4(String data) {
        System.out.println("topic.messages接收到的消息 : " + data);
    }
}
