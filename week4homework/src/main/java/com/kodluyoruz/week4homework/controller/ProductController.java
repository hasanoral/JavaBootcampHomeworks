package com.kodluyoruz.week4homework.controller;

import com.kodluyoruz.week4homework.model.dto.ProductDto;
import com.kodluyoruz.week4homework.model.request.ProductRequest;
import com.kodluyoruz.week4homework.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    public final ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDto createProduct(@RequestBody ProductRequest request) {
        return service.createProduct(request);
    }

    @GetMapping("{id}")
    public ProductDto getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    @PutMapping("{id}")
    public ProductDto updateProduct(@PathVariable int id, @RequestBody ProductRequest request) {
        return service.updateProduct(id, request);
    }

    @GetMapping
    public List<ProductDto> getProducts(@RequestParam(required = false) String name) {
        return service.getProducts(name);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable int id) {
        service.deleteProduct(id);
    }


}
