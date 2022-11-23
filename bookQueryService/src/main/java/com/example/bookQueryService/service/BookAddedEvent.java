package com.example.bookQueryService.service;

import com.example.bookQueryService.service.dto.BookDTO;
import lombok.Data;
import org.springframework.kafka.annotation.KafkaListener;

@Data

public class BookAddedEvent {

    private BookQueryService bookQueryService;

    @KafkaListener(topics = {"bookAdded"})
    public void listen(BookDTO bookDTO) {
        bookQueryService.addBook(bookDTO);
    }
}
