package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/19 下午3:20
 */
@Component
public class Consumer {

    @KafkaListener(topics = "test")
    public void listen(String data){
        System.out.println("收到消息"+data);

    }
}
