package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.BasketDto;
import com.kodluyoruz.week4homework.model.entity.Basket;
import com.kodluyoruz.week4homework.model.request.BasketRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {
    BasketMapper BASKET_MAPPER = Mappers.getMapper(BasketMapper.class);

    BasketDto toBasketDto(Basket basket);

    List<BasketDto> toBasketDtoList(List<Basket> baskets);

    Basket createBasket(BasketRequest request);

    void updateBasket(@MappingTarget Basket basket, BasketRequest request);

}
