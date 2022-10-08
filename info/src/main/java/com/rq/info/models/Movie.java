package com.rq.info.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Movie {

    private Long movieId;
    private String title;
    private String description;

}
