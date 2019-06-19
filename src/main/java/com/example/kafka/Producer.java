package com.example.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/19 下午3:14
 */
@Component
@Slf4j
public class Producer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    public void send(){
        Message message = new Message();
        message.setId(2321L);
        message.setMsg("kafka你好");
        message.setSendTime(new Date());
        log.info("发送消息{0}",gson.toJson(message));
        kafkaTemplate.send("test",gson.toJson(message));
    }


}
