package com.rq.info.controller;

import com.rq.info.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/movies")
public class MoveInfoController {

    @GetMapping("/{movieId}")
    public Mono<Movie> getMovie(@PathVariable Long movieId) {
        return Mono.just(new Movie(movieId, "Transformers", "Test"));
    }

}
