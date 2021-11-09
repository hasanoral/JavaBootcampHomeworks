package com.kodluyoruz.week4homework.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private int orderId;
    private Integer orderQuantity;
    private Double orderUnitPrice;
    private Double orderTotalPrice;
    private Integer orderProductId;
    private Integer orderUserId;

}
