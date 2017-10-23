package com.xiao;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

public class Listener {

    @KafkaListener(topics = {"test-topic"})
    public void listen(ConsumerRecord<?, ?> record) {
//        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
//        if (kafkaMessage.isPresent()) {
        Object message = record.value();
        System.out.println("listen1 " + message);
    }
}