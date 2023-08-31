package com.example.kafkaexample.kafka;

import com.example.kafkaexample.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "sample-topic-json", groupId = "myGroup")
    public void consume (User user ){
        LOGGER.info("Consumed new user" +user.toString());
    }
}
