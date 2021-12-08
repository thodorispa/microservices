package microservices.cloud.services;

import microservices.cloud.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId);

    void deleteBeer(UUID beerId);
}
