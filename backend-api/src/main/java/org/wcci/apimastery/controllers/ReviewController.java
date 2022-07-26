package org.wcci.apimastery.controllers;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.repositories.ReviewRepository;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewRepository reviewRepo;

    public ReviewRepository getReviewRepo() {
        return reviewRepo;
    }

    public ReviewController(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @RequestMapping("/")
    public String showAllReviews(Model model) {
        model.addAttribute("reviews", reviewRepo.findAll());
        return "allReviews";
    }
}
