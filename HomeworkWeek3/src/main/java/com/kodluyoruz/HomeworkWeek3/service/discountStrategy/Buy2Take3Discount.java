package com.kodluyoruz.HomeworkWeek3.service.discountStrategy;

import com.kodluyoruz.HomeworkWeek3.discountProperties.DiscountProperties;
import com.kodluyoruz.HomeworkWeek3.model.cart.Cart;
import com.kodluyoruz.HomeworkWeek3.model.cart.CartItem;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
@RequiredArgsConstructor
public class Buy2Take3Discount implements Discount{

    private final DiscountProperties discountProperties;
    List<Double> buy2take3list = new ArrayList<>();
    @Override
    public double appylyDiscount(CartItem cartItem) {
        int discountQuantity = cartItem.getQuantity()/3;
        double paidQuantity = cartItem.getQuantity() - discountQuantity;
        return paidQuantity * cartItem.getProduct().getPrice();
    }

    @Override
    public boolean isOkey(Cart cart) {
        boolean flag = true;
        if(cart.getCartItemList().get(0).getQuantity()<5){
            flag = false;
        }
        return flag;
    }
}
