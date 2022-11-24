package com.example.bookQueryService.service;

import com.example.bookQueryService.service.dto.BookDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Data
@Component

public class BookAddedEvent {

    private BookQueryService bookQueryService;


    @KafkaListener(topics = "bookAdded", groupId = "gid")
    public void listen(@Payload String bookDTO) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("listener");
        bookQueryService.addBook(objectMapper.readValue(bookDTO, BookDTO.class));
    }
//    public void receive(@Payload SpeedRecord speedRecord,
//                        @Headers MessageHeaders headers)
}
