package com.zijiez.spring.RabbitMq.Consumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

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

    /******************ack应答*************************/
    @RabbitListener(queues = "ack.test")
    public void handleMessage5(String data,Channel channel, Message message) {
        System.out.println("ack.test接收到的消息 : " + data);
        try {
            Thread.sleep(5000L);
//            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); // 消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
//            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true); // ack返回false，并重新回到队列，api里面解释得很清楚
//            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true); // 拒绝消息
            channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true); // ack返回false，并重新回到队列，api里面解释得很清楚
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @RabbitListener(queues = "ack.test")
    public void handleMessage6(String data,Channel channel, Message message) {
        System.out.println("ack.test2接收到的消息 : " + data);
        try {
            Thread.sleep(5000L);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); // 消息的标识，false只确认当前一个消息收到，true确认所有consumer获得的消息
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
