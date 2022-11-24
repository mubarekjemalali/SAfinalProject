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

public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private KafkaTemplate<String, BookDTO> kafkaTemplate;
    @Override
    public String addBook(BookDTO bookDTO) {
        System.out.println("before adding book");
       bookRepository.save(modelMapper.map(bookDTO, Book.class));
        kafkaTemplate.send("bookAdded", bookDTO);

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
