package com.example.customers.repo;

import com.example.customers.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer> {


    Optional<Customer> findByFirstName(String firstName);
}

