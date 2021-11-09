package com.kodluyoruz.week4homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketDto {
    private double priceOfBasket;
    private double quantityOfBasket;
    private int basketId;
}
