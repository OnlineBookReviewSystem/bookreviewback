package com.booknest.bookreview.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReviewRequest {

    @NotBlank
    private String bookTitle;

    @NotBlank
    private String author;

    @NotBlank
    private String genre;

    @Min(1)
    @Max(5)
    private int rating;

    @NotBlank
    private String reviewText;
}
