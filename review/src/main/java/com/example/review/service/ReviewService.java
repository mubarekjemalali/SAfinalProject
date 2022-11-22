package com.example.review.service;

import com.example.review.service.dto.ReviewDTO;

public interface ReviewService  {

    void getReview(String reviewId);

    void addReview(ReviewDTO reviewDto);
}

