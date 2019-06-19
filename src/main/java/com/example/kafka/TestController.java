package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/19 下午3:38
 */
@RestController
public class TestController {

    @Autowired
    private Producer producer;

    @RequestMapping("test")
    @ResponseBody
    public void haha(){
        producer.send();
    }
}
