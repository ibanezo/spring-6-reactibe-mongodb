package com.example.reactivemongo.services;

import com.example.reactivemongo.domain.Beer;
import com.example.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {

    Flux<BeerDTO> findByBeerStyle(String beerStyle);

    Mono<BeerDTO> findFirstByBeerName(String beerName);

    Flux<BeerDTO> listBeers();
    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDto);

    Mono<BeerDTO> saveBeer(BeerDTO beerDTO);
    Mono<BeerDTO> getById(String beerId);

    Mono<BeerDTO> updateBeer(String beerId, BeerDTO beerDTO);

    Mono<BeerDTO> patchBeer(String beerId, BeerDTO beerDTO);

    Mono<Void> deleteBeerById(String beerId);
}
