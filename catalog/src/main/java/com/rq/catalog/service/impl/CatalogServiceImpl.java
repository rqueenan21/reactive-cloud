package com.rq.catalog.service.impl;

import com.rq.catalog.models.CatalogItem;
import com.rq.catalog.models.Movie;
import com.rq.catalog.models.Rating;
import com.rq.catalog.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final WebClient webClient;

    @Override
    public Mono<CatalogItem> getCatalogItems(Long movieId) {
        Mono<Movie> movieInfo = getMovieInfo(movieId);
        Mono<Rating> movieRating = getMovieRatings(movieId);
        return Mono.zip(movieInfo, movieRating, CatalogItem::new);
    }

    @Override
    public Mono<CatalogItem> getUserItems(Long userId) {
        return null;
    }

    private Mono<Movie> getMovieInfo(Long movieId) {
        return webClient.get()
                .uri("http://localhost:8181/movies/" + movieId)
                .retrieve()
                .bodyToMono(Movie.class);
    }

    private Mono<Rating> getMovieRatings(Long movieId) {
        return webClient.get()
                .uri("http://localhost:8081/ratings/" + movieId)
                .retrieve()
                .bodyToMono(Rating.class);
    }
}
