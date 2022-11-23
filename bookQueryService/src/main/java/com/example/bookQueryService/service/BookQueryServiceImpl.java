package com.example.bookQueryService.service;


import com.example.bookQueryService.Domain.Book;
import com.example.bookQueryService.Domain.Review;
import com.example.bookQueryService.repo.BookRepository;
import com.example.bookQueryService.service.dto.BookDTO;
import com.example.bookQueryService.service.dto.ReviewDTO;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
public class BookQueryServiceImpl implements BookQueryService {

    private BookRepository bookRepository;
    private ModelMapper modelMapper;

    @Override
    public void addBook(BookDTO bookDTO) {
        bookRepository.save(modelMapper.map(bookDTO, Book.class));
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        // replace the book in the database
        // might need to check if the book exists first
        // then update it, don't save two instances

        bookRepository.save(modelMapper.map(bookDTO, Book.class));
    }

    @Override
    public void deleteBook(String bookIsbn) {
        bookRepository.deleteById(bookIsbn);
    }

    @Override
    public void addReview(ReviewDTO reviewDTO) {


        // get the book from the database, by using the isbn
        // add the review to the book
        // save the book to the database

       Book book =  bookRepository.findByIsbn(reviewDTO.getIsbn());
       book.getReviews().add(modelMapper.map(reviewDTO, Review.class));
       bookRepository.save(book);
    }
}
