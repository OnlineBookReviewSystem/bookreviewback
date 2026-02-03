package com.booknest.bookreview.service;

import com.booknest.bookreview.dto.ReviewRequest;
import com.booknest.bookreview.exception.ResourceNotFoundException;
import com.booknest.bookreview.model.BookReview;
import com.booknest.bookreview.repository.BookReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewServiceImpl implements BookReviewService {

    private final BookReviewRepository repository;

    public ReviewServiceImpl(BookReviewRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
   @Override
public BookReview createReview(ReviewRequest request) {

    BookReview review = new BookReview(
            null,
            request.getBookTitle(),
            request.getAuthor(),
            request.getGenre(),
            request.getRating(),      // MUST be int
            request.getReviewText()
    );

    return repository.save(review);
}

    @Override
    public List<BookReview> getAllReviews() {
        return repository.findAll();
    }

    @Override
    @Transactional
   @Override
public BookReview updateReview(Long id, ReviewRequest request) {

    BookReview review = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Review not found"));

    review.setBookTitle(request.getBookTitle());
    review.setAuthor(request.getAuthor());
    review.setGenre(request.getGenre());
    review.setRating(request.getRating());
    review.setReviewText(request.getReviewText());

    return repository.save(review);
}

    @Override
    @Transactional
    public void deleteReview(Long id) {
        BookReview review = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Review not found with id: " + id));
        repository.delete(review);
    }
}
