package com.atharv.project.FirstSystem;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
@Component
public class RazorPayPaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment = "Razor Pay";
        System.out.println("Payment from : " + payment);
        return payment;
    }
}
