package com.example.borrowing.Domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@RequiredArgsConstructor
public class Review {
    @Id
    private Long id;
    private String isbn;
    private String reviewRating;
    private String customerName;
    private String description;
}
