package com.example.bookQueryService.service;

import com.example.bookQueryService.service.dto.BookDTO;
import com.example.bookQueryService.service.dto.ReviewDTO;
import org.springframework.stereotype.Service;

@Service
public interface BookQueryService {
    void addBook(BookDTO bookDTO);

    void updateBook(BookDTO bookDTO);

    void deleteBook(String bookIsbn);

    void addReview(ReviewDTO reviewDTO);
}
