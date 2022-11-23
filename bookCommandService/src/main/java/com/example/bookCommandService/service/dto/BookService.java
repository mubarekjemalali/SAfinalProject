package com.example.bookCommandService.service.dto;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    String addBook();

    void updateBook(BookDTO bookDTO);

    void deleteBook(String bookIsbn);
}
