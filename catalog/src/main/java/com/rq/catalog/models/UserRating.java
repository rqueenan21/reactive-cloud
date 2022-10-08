package com.rq.catalog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Flux;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserRating {

    private Flux<Rating> ratings;

}
