package com.example.review.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Review {
    private String isbn;
    private String reviewRating;
    private String customerName;
    private String description;

}
