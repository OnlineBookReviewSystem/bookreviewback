package com.booknest.bookreview.service;

import com.booknest.bookreview.model.BookReview;
import com.booknest.bookreview.repository.BookReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookReviewService {

    private final BookReviewRepository repository;

    public BookReviewService(BookReviewRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public BookReview addReview(BookReview review) {
        return repository.save(review);
    }

    // READ
    public List<BookReview> getAllReviews() {
        return repository.findAll();
    }

    // UPDATE
    public BookReview updateReview(Long id, BookReview review) {
        review.setId(id);
        return repository.save(review);
    }

    // DELETE
    public void deleteReview(Long id) {
        repository.deleteById(id);
    }
}
