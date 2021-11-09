package com.kodluyoruz.week4homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int productId;
    private String productName;
    private String productDesc;
    private double productPrice;
}
