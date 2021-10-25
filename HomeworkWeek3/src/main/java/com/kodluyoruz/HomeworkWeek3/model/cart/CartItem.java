package com.kodluyoruz.HomeworkWeek3.model.cart;

import com.kodluyoruz.HomeworkWeek3.model.Products;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CartItem {
    private Products product;
    private int quantity;

    public double getPrice(){
        return product.getPrice() * quantity;
    }

}

