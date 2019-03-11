package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
@RabbitListener(queues = "test")
@Slf4j
@Component
public class Consumer {
@RabbitHandler
    public void handler(String message){
        log.info("接收到消息---->"+message+"---->并且处理了");
    }
}
