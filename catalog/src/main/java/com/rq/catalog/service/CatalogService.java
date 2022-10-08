package com.rq.catalog.service;

import com.rq.catalog.models.CatalogItem;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CatalogService {

    Mono<CatalogItem> getCatalogItems(Long movieId);

    Mono<CatalogItem> getUserItems(Long userId);

}
