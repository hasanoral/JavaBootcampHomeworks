package com.kodluyoruz.HomeworkWeek3.service.discountStrategy;

import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.cart.CartItem;

public interface Discount {
    double appylyDiscount(CartItem cartItem);
    boolean isOkey(Cart cart);
}
