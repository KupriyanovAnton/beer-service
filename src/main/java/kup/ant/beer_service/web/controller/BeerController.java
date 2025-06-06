package kup.ant.beer_service.web.controller;

import kup.ant.beer_service.web.model.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

        //todo impl
        return ResponseEntity.ok(BeerDto.builder().build());
    }

    @PostMapping
    public ResponseEntity<Void> saveNewBeer(@RequestBody BeerDto beerDto) {

        //todo impl
        return ResponseEntity.accepted().build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

        //todo impl
        return ResponseEntity.noContent().build();
    }

}
