package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.OrderDto;
import com.kodluyoruz.week4homework.model.entity.Order;
import com.kodluyoruz.week4homework.model.request.OrderRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    OrderDto toOrderDto(Order order);

    List<OrderDto> toOrderDtoList(List<Order> orders);

    Order createOrder(OrderRequest request);

    void updateOrder(@MappingTarget Order Order, OrderRequest request);
}
