package com.kodluyoruz.week4homework.service;

import com.kodluyoruz.week4homework.model.dto.CheckoutDto;
import com.kodluyoruz.week4homework.model.entity.Checkout;
import com.kodluyoruz.week4homework.model.request.CheckoutRequest;
import com.kodluyoruz.week4homework.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.kodluyoruz.week4homework.model.mapper.CheckoutMapper.CHECKOUT_MAPPER;


@Service
@RequiredArgsConstructor
public class CheckoutService {
    private final CheckoutRepository repository;

    public CheckoutDto createCheckout(CheckoutRequest request) {
        Checkout checkout = CHECKOUT_MAPPER.createCheckout(request);

        Checkout savedCheckout = repository.save(checkout);
        return CHECKOUT_MAPPER.toCheckoutDto(savedCheckout);
    }


    public CheckoutDto getCheckout(int id) {
        Checkout checkout = getCheckoutEntity(id);
        return CHECKOUT_MAPPER.toCheckoutDto(checkout);
    }

    private Checkout getCheckoutEntity(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public CheckoutDto updateCheckout(int id, CheckoutRequest request) {
        Checkout checkout = getCheckoutEntity(id);
        CHECKOUT_MAPPER.updateCheckout(checkout, request);

        Checkout updatedCheckout = repository.save(checkout);
        return CHECKOUT_MAPPER.toCheckoutDto(updatedCheckout);
    }

    public List<CheckoutDto> getCheckouts(String name) {
        if (name != null) {
            return CHECKOUT_MAPPER.toCheckoutDtoList(repository.findAllByNameContainsOrDescriptionContains(name));
        }

        return CHECKOUT_MAPPER.toCheckoutDtoList(repository.findAll());
    }

    public void deleteCheckout(int id) {

        repository.deleteById(id);
    }
}
