package com.example.bookQueryService.service;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "bookAdded", groupId = "bookQueryService")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }
}
