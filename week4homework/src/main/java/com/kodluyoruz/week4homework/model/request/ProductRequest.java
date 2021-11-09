package com.kodluyoruz.week4homework.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private Integer categoryId;
    @NotBlank(message = "cannot be blank")
    private String name;
    @NotBlank(message = "cannot be blank")
    private String desc;
    @Min(value = 0, message = "price cannot be lower than 0")
    private Double price;
}
