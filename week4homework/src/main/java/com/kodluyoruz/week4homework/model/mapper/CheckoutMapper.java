package com.kodluyoruz.week4homework.model.mapper;

import com.kodluyoruz.week4homework.model.dto.CheckoutDto;
import com.kodluyoruz.week4homework.model.entity.Checkout;
import com.kodluyoruz.week4homework.model.request.CheckoutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CheckoutMapper {

    CheckoutMapper CHECKOUT_MAPPER = Mappers.getMapper(CheckoutMapper.class);

    CheckoutDto toCheckoutDto(Checkout checkout);

    List<CheckoutDto> toCheckoutDtoList(List<Checkout> checkouts);

    Checkout createCheckout(CheckoutRequest request);

    void updateCheckout(@MappingTarget Checkout checkout, CheckoutRequest request);

}
