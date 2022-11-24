package com.example.bookCommandService.Domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor
public class Book {
    @Id
    private String isbn;
    private String title;
    private String author;
    private String description;
}
