package com.booknest.bookreview.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "book_reviews")
public class BookReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bookTitle;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private int rating;

    @Column(length = 1000, nullable = false)
    private String reviewText;

    // Default constructor (required by JPA)
    public BookReview() {}

    // Constructor used in service
    public BookReview(String bookTitle, String author, String genre, int rating, String reviewText) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookReview that = (BookReview) o;
        return rating == that.rating &&
                Objects.equals(id, that.id) &&
                Objects.equals(bookTitle, that.bookTitle) &&
                Objects.equals(author, that.author) &&
                Objects.equals(genre, that.genre) &&
                Objects.equals(reviewText, that.reviewText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookTitle, author, genre, rating, reviewText);
    }

    @Override
    public String toString() {
        return "BookReview{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", reviewText='" + reviewText + '\'' +
                '}';
    }
}
