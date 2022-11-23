package com.example.bookQueryService.service.dto;

import lombok.Data;

@Data
public class ReviewDTO {

    private String isbn;
    private String reviewRating;
    private String customerName;
    private String description;
}

