package com.example.bookQueryService.Domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@RequiredArgsConstructor
public class Book {
    @Id
    private String id;
    private String isbn;
    private String title;
    private String author;
    private String description;
    private List<Review> reviews;
}
