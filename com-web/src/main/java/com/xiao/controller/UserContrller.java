package com.xiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserContrller {

    //注入
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send() {
//        kafkaTemplate.send("test-topic", "hello");
//        kafkaTemplate.send("test-topic", "key-1", "hello");

        ListenableFuture<SendResult<String, String>> result = kafkaTemplate.send("test-topic", "key-1", "hello");
    }

    @RequestMapping("user")
    public String jump() {
        return "ask";
    }


}
