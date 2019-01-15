package com.zijiez.spring.RabbitMq.Producer;

import com.alibaba.fastjson.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/15 14:52
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@Service
public class ProducerService {
    @Autowired
    RabbitTemplate rabbitTemplate;


    //消息发送者-没有使用exchange
    public void sendMq(){
        JSONObject paramItem = new JSONObject();
        paramItem.put("ces1",1);
        paramItem.put("ceshi2","2");
        // 发送mq
        rabbitTemplate.convertAndSend("ZZJ_QUEUE",paramItem.toString());
    }

    //消息发送者-没有使用exchange
    public void sendMq2(){
        JSONObject paramItem = new JSONObject();
        paramItem.put("ces1",1);
        paramItem.put("ceshi2","topic.message");
        // 发送mq
        rabbitTemplate.convertAndSend("exchange","topic.message",paramItem.toString());

        JSONObject paramItem2 = new JSONObject();
        paramItem2.put("ces1",1);
        paramItem2.put("ceshi2","topic.messages");
        // 发送mq
        rabbitTemplate.convertAndSend("exchange","topic.messages",paramItem.toString());
    }

}
