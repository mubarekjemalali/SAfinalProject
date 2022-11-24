package com.example.bookCommandService.service.dto;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    String addBook(BookDTO bookDTO);

    void updateBook(BookDTO bookDTO);

    void deleteBook(String bookIsbn);
}
