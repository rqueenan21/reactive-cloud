package com.rq.catalog.controller;

import com.rq.catalog.models.CatalogItem;
import com.rq.catalog.service.CatalogService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping("/{movieId}")
    public ResponseEntity<Mono<CatalogItem>> getCatalogItems(@PathVariable Long movieId){
       return ResponseEntity.ok(catalogService.getCatalogItems(movieId));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Mono<CatalogItem>> getUserCatalogItems(@PathVariable Long userId){
        return ResponseEntity.ok(catalogService.getCatalogItems(userId));
    }

}
