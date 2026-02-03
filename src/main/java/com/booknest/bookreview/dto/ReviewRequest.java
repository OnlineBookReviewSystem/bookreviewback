package com.booknest.bookreview.dto;

import jakarta.validation.constraints.NotBlank;

public class ReviewRequest {

    @NotBlank(message = "Book title is required")
    private String bookTitle;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "Genre is required")
    private String genre;

    @NotBlank(message = "Rating is required")
    private String rating;   // ✅ FIXED

    @NotBlank(message = "Review text is required")
    private String reviewText;

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
