package com.kodluyoruz.HomeworkWeek3.discountProperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "discount")
@Data
public class DiscountProperties {
    private double deliveryFee;
    private double deliveryFeeLimit;
    private double discPercentage;
    private int creditCartCommission;
}
