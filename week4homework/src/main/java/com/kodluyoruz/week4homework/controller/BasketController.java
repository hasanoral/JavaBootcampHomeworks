package com.kodluyoruz.week4homework.controller;

import com.kodluyoruz.week4homework.model.dto.BasketDto;
import com.kodluyoruz.week4homework.model.request.BasketRequest;
import com.kodluyoruz.week4homework.service.BasketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("baskets")
@RequiredArgsConstructor
@Slf4j
public class BasketController {
    private final BasketService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BasketDto createBasket(@RequestBody BasketRequest request) {
        return service.createBasket(request);
    }

    @GetMapping("{id}")
    public BasketDto getBasket(@PathVariable int basket_id) {
        return service.getBasket(basket_id);
    }

    @PutMapping("{id}")
    public BasketDto updateBasket(@PathVariable int basket_id, @RequestBody BasketRequest request) {
        return service.updateBasket(basket_id, request);
    }

    @GetMapping
    public List<BasketDto> getBaskets(@RequestParam(required = false) String name) {
        return service.getBaskets(name);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBasket(@PathVariable int id) {
        service.deleteBasket(id);
    }

}
