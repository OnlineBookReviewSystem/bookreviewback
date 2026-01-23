package com.booknest.bookreview.repository;

import com.booknest.bookreview.model.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, Long> {
}
