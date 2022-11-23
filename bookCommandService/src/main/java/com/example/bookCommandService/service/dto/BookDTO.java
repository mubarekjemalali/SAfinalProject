package com.example.bookCommandService.service.dto;

import lombok.Data;

@Data
public class BookDTO {

    private String isbn;
    private String title;
    private String author;
    private String description;
}
