package com.rq.catalog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class CatalogItem {

    private Long movieId;
    private String title;
    private String description;
    private int rating;

    public CatalogItem(Movie movie, Rating rating) {
        this.movieId = movie.getMovieId();
        this.description= movie.getDescription();
        this.title= movie.getTitle();
        this.rating=rating.getRating();
    }
}
