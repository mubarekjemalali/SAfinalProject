package com.example.bookQueryService.service;

import com.example.bookQueryService.service.dto.ReviewDTO;
import lombok.Data;
import org.springframework.kafka.annotation.KafkaListener;

@Data
public class ReviewAddedEvent {
    private BookQueryService bookQueryService;

    @KafkaListener(topics = {"reviewAdded"})
    public void listen(ReviewDTO reviewDTO) {
        bookQueryService.addReview(reviewDTO);
    }
}
