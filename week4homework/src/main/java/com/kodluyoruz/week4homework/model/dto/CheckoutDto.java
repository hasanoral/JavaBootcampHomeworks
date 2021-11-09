package com.kodluyoruz.week4homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CheckoutDto {
    private int checkoutId;
    private String checkoutName;
    private double checkoutPrice;
}
