package com.example.borrowing.service.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class BookDTO {
    private String isbn;
    private String title;
    private String author;
    private String description;
    private List<String> reviewRating;
}
