package com.example.kafka;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/19 下午3:16
 */
@Getter
@Setter
public class Message {

    private Long id;

    private String msg;

    private Date sendTime;


}
