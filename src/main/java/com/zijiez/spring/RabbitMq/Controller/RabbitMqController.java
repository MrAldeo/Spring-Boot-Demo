package com.zijiez.spring.RabbitMq.Controller;

import com.zijiez.spring.RabbitMq.Producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhangzijie
 * @Date: 2019/1/15 14:51
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
@RestController
public class RabbitMqController {
    @Autowired
    ProducerService producerService;

    //通哥queue发送消息
    @RequestMapping(value="/sendMq",method= RequestMethod.GET)
    public void assetsSummary(){
        producerService.sendMq();
    }

    //通过exchange发送消息
    //通哥queue发送消息
    @RequestMapping(value="/sendMqExchange",method= RequestMethod.GET)
    public void assetsSummary2(){
        producerService.sendMq2();
    }
}
