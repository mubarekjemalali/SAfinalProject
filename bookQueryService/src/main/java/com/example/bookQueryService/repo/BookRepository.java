package com.example.bookQueryService.repo;


import com.example.bookQueryService.Domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    Book findByIsbn(String isbn);
}

