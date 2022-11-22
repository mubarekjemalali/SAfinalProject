package com.example.review.web;

import com.example.review.service.ReviewService;
import com.example.review.service.dto.ReviewDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Data
@RequiredArgsConstructor

public class ReviewController {
    private ReviewService reviewService;

    @GetMapping("/getReview")
    public void getReview (String reviewId) {
        reviewService.getReview(reviewId);
    }

    @PostMapping("/addReview")
    public void addReview (ReviewDTO reviewDto) {
        reviewService.addReview(reviewDto);
    }

}
