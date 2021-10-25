package com.kodluyoruz.HomeworkWeek3.service.paymentFactory;

import com.kodluyoruz.HomeworkWeek3.model.enumTypes.Pay;
import com.kodluyoruz.HomeworkWeek3.model.checkout.Bill;

public interface Payment {
    Pay getType();
    void payBill(Bill bill);

}
