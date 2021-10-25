package com.kodluyoruz.HomeworkWeek3.service.paymentFactory;

import com.kodluyoruz.HomeworkWeek3.model.enumTypes.Pay;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import org.springframework.stereotype.Component;

@Component
public class Cash implements Payment{
    @Override
    public Pay getType() {
        return Pay.CASH;
    }

    @Override
    public void payBill(Bill bill) {
        System.out.println("Payment amount is: " + bill.getTotalPrice());
    }
}
