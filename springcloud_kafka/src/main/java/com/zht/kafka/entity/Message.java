package com.zht.kafka.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private long id; //id
    private String msg; //消息
    private Date sendTime; //发送时间
}
