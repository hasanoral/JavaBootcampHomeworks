package com.kodluyoruz.HomeworkWeek3.service.paymentFactory;

import com.kodluyoruz.HomeworkWeek3.model.enumTypes.Pay;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "discount")
@Component
@Data
public class CreditCard implements Payment{
    private double creditCartCommission;
    @Override
    public Pay getType() {
        return Pay.CREDİT_CARD;
    }

    @Override
    public void payBill(Bill bill) {
        double commission = bill.getTotalPrice() * (creditCartCommission / 100);
        double totalAmount = bill.getTotalPrice() + commission;
        System.out.println("Payment amount is: " + totalAmount);
    }
}
