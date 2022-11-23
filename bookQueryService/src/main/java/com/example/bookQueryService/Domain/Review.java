package com.example.bookQueryService.Domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Review {
    @Id
    private Long id;
    private String isbn;
    private String reviewRating;
    private String customerName;
    private String description;
}
