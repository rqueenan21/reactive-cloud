package com.rq.ratings.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Rating {

    private Long movieId;
    private int rating;

}
