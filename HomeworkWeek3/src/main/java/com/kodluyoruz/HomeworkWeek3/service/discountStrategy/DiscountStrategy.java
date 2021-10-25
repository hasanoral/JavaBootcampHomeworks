package com.kodluyoruz.HomeworkWeek3.service.discountStrategy;

import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.cart.CartItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiscountStrategy {

    private final List<Discount> discountList;
    private double totalprice = 0;

    public double executeDiscount(Cart cart){
        for(CartItem cartItem : cart.getCartItemList()){
            discountList.stream()
                    .filter(discount -> discount.isOkey(cart))
                    .findFirst()
                    .ifPresent(discount -> totalprice = discount.appylyDiscount(cartItem));

        }
        return totalprice;
    }
}
