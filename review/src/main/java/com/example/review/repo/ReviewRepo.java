package com.example.review.repo;

import com.example.review.domain.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepo extends MongoRepository<Review, String> {

}

