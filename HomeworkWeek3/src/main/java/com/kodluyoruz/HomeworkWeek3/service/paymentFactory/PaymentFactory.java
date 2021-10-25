package com.kodluyoruz.HomeworkWeek3.service.paymentFactory;

import com.kodluyoruz.HomeworkWeek3.model.enumTypes.Pay;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentFactory {
    private final Map<Pay, Payment> paymentMap;

    public PaymentFactory(List<Payment> payments) {
        this.paymentMap = payments.stream()
                .collect(Collectors.toMap(Payment::getType, payment -> payment));
    }

    public Payment getPaymentMethod(Pay type) {
        return paymentMap.get(type);
    }
}
