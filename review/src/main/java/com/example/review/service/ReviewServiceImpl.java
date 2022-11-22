package com.example.review.service;

import com.example.review.domain.Review;
import com.example.review.repo.ReviewRepo;
import com.example.review.service.dto.ReviewDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService{
    private ReviewRepo reviewRepo;
    private ModelMapper modelMapper;
    @Override
    public void getReview(String reviewId) {

    }

    @Override
    public void addReview(ReviewDTO reviewDto) {
            Review review = modelMapper.map(reviewDto, Review.class);
            reviewRepo.save(review);
    }
}
