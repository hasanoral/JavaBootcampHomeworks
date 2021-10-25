package com.kodluyoruz.HomeworkWeek3.model.checkout;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Bill {
    private double totalPrice;
    private List<BillItem> billItems;
}
