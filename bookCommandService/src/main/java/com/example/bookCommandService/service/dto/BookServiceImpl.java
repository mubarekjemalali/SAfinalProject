package com.example.bookCommandService.service.dto;

import com.example.bookCommandService.Domain.Book;
import com.example.bookCommandService.repo.BookRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;
    private ModelMapper modelMapper;

    @Autowired
    private KafkaTemplate<String, BookDTO> kafkaTemplate;
    @Override
    public String addBook() {
        System.out.println("before adding book");
//        bookRepository.save(modelMapper.map(bookDTO, Book.class));
        System.out.println("book added");
        kafkaTemplate.send("bookAdded", new BookDTO());

        return "book added";
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
}
