package com.example.borrowing.repo;



import com.example.borrowing.Domain.Borrowing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowingRepo extends MongoRepository<Borrowing, Integer> {


}

