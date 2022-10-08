package com.rq.ratings.controller;

import com.rq.ratings.models.Rating;
import com.rq.ratings.models.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("ratings")
public class RatingController {

    @GetMapping("/{movieId}")
    public Mono<Rating> getRating(@PathVariable Long movieId) {
        return Mono.just(new Rating(movieId, 5));
    }

    @GetMapping("/users/{userId}")
    public Mono<UserRating> getUserRatings(@PathVariable Long userId) {
        return Mono.just(new UserRating(
                        Flux.just(
                                new Rating(1L, 5),
                                new Rating(2L, 10)
                        )));
    }

}
