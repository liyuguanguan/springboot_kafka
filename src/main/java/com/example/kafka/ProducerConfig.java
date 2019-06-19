package com.example.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/19 下午5:41
 */
@Configuration
public class ProducerConfig {

//    @Bean
//    public ProducerFactory<Object,Object> config(){
//        Map<String, Object> map = new HashMap<>();
//        map.put(org.apache.kafka.clients.producer.ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, 1);
//        return new DefaultKafkaProducerFactory<>(map);
//    }
}
