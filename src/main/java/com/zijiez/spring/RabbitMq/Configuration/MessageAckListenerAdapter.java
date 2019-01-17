//package com.zijiez.spring.RabbitMq.Configuration;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
//
///**
// * @Auther: zhangzijie
// * @Date: 2019/1/17 16:29
// * @Email: zhangzj@vipcode.com
// * @Description: 设置ack的手动应答
// */
//public class MessageAckListenerAdapter implements ChannelAwareMessageListener{
////    @Bean
////    MessageAckListenerAdapter listenerAdapter(RabbitMsgReceiver rabbitMessageReceier){
////
////    }
//
//    @Override
//    public void onMessage(Message message, Channel channel) throws Exception {
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
//    }
//}
