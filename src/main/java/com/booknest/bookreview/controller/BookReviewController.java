package com.booknest.bookreview.controller;

import com.booknest.bookreview.model.BookReview;
import com.booknest.bookreview.service.BookReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class BookReviewController {

    private final BookReviewService service;

    public BookReviewController(BookReviewService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public BookReview createReview(@RequestBody BookReview review) {
        return service.addReview(review);
    }

    // READ
    @GetMapping
    public List<BookReview> getAllReviews() {
        return service.getAllReviews();
    }

    // UPDATE
    @PutMapping("/{id}")
    public BookReview updateReview(@PathVariable Long id,
                                   @RequestBody BookReview review) {
        return service.updateReview(id, review);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        service.deleteReview(id);
    }
}
