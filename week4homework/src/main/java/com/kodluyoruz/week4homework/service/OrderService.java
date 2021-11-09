package com.kodluyoruz.week4homework.service;

import com.kodluyoruz.week4homework.model.dto.OrderDto;
import com.kodluyoruz.week4homework.model.entity.Order;
import com.kodluyoruz.week4homework.model.request.OrderRequest;
import com.kodluyoruz.week4homework.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.kodluyoruz.week4homework.model.mapper.OrderMapper.ORDER_MAPPER;


@Service
@RequiredArgsConstructor

public class OrderService {
    private final OrderRepository repository;

    public OrderDto createOrder(OrderRequest request) {
        Order order = ORDER_MAPPER.createOrder(request);

        Order savedOrder = repository.save(order);
        return ORDER_MAPPER.toOrderDto(savedOrder);
    }


    public OrderDto getOrder(int id) {
        Order order = getOrderEntity(id);
        return ORDER_MAPPER.toOrderDto(order);
    }

    private Order getOrderEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public OrderDto updateOrder(int id, OrderRequest request) {
        Order order = getOrderEntity(id);
        ORDER_MAPPER.updateOrder(order, request);

        Order updatedOrder = repository.save(order);
        return ORDER_MAPPER.toOrderDto(updatedOrder);
    }

    public List<OrderDto> getOrders(String name) {
        if (name != null) {
            return ORDER_MAPPER.toOrderDtoList(repository.findAllByNameContainsOrDescriptionContains(name));
        }

        return ORDER_MAPPER.toOrderDtoList(repository.findAll());
    }

    public void deleteOrder(int id) {
        repository.deleteById(id);
    }
}

