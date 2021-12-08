package microservices.cloud.services;

import lombok.extern.slf4j.Slf4j;
import microservices.cloud.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId) {
        log.info("Beer updated....");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.info("Beer deleted....");
    }
}
