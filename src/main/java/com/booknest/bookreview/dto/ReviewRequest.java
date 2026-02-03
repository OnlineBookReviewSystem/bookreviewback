package com.booknest.bookreview.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReviewRequest {

    @NotBlank(message = "Book title is required")
    private String bookTitle;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "Genre is required")
    private String genre;

    @Min(1)
    @Max(5)
    private int rating;

    @NotBlank(message = "Review text is required")
    private String reviewText;
}
