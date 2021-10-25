package com.kodluyoruz.HomeworkWeek3.service;

import com.kodluyoruz.HomeworkWeek3.service.discountStrategy.DiscountStrategy;
import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import com.kodluyoruz.HomeworkWeek3.model.checkout.BillItem;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@ConfigurationProperties(prefix = "discount")
@Data
public class CheckoutService {

    private final DiscountStrategy discountStrategy;
    private int deliveryFee;
    private int deliveryFeeLimit;

    public Bill checkoutService(Cart cart){
        List<BillItem> billItems = cart.getCartItemList()
                .stream()
                .map(cartItem -> BillItem.builder()
                        .productName(cartItem.getProduct().getName())
                        .quantity(cartItem.getQuantity())
                        .price(cartItem.getPrice())
                        .desc(cartItem.getProduct().getDesc())
                        .discountedPrice(discountStrategy.executeDiscount(cart))
                        .build())
                .collect(Collectors.toList());

        double totalSum = billItems.stream()
                .map(BillItem::getDiscountedPrice)
                .mapToDouble(d -> d)
                .sum();

        return Bill.builder()
                .billItems(billItems)
                .totalPrice(totalSum)
                .build();

    }
}
