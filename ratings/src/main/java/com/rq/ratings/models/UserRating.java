package com.rq.ratings.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserRating {

    private Flux<Rating> ratings;

}
