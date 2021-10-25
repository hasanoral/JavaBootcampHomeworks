package com.kodluyoruz.HomeworkWeek3.menu;

import com.kodluyoruz.HomeworkWeek3.model.enumTypes.Pay;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;
import com.kodluyoruz.HomeworkWeek3.service.paymentFactory.Payment;
import com.kodluyoruz.HomeworkWeek3.service.paymentFactory.PaymentFactory;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Data
@Component
public class pagePayment {
    private final Scanner scanner;
    private final PaymentFactory paymentFactory;

    public void doPayment(Bill bill){
        System.out.println("What is your payment type if it is cash enter 1 - if it is credit cart enter 2 : ");
        int select = scanner.nextInt();

        if(select == 1){
            Payment payment = paymentFactory.getPaymentMethod(Pay.CASH);
            payment.payBill(bill);
        }else{
            Payment payment = paymentFactory.getPaymentMethod(Pay.CREDİT_CARD);
            payment.payBill(bill);
        }


    }


}
