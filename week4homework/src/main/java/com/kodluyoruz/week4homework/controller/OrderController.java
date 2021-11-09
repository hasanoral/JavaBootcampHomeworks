package com.kodluyoruz.week4homework.controller;


import com.kodluyoruz.week4homework.model.dto.OrderDto;
import com.kodluyoruz.week4homework.model.request.OrderRequest;
import com.kodluyoruz.week4homework.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderDto createOrder(@RequestBody OrderRequest request) {
        return service.createOrder(request);
    }

    @GetMapping("{id}")
    public OrderDto getOrder(@PathVariable int id) {
        return service.getOrder(id);
    }

    @PutMapping("{id}")
    public OrderDto updateOrder(@PathVariable int id, @RequestBody OrderRequest request) {
        return service.updateOrder(id, request);
    }

    @GetMapping
    public List<OrderDto> getOrders(@RequestParam(required = false) String name) {
        return service.getOrders(name);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable int id) {
        service.deleteOrder(id);
    }


}
