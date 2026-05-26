package com.atharv.project.FirstSystem;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Controller;
// import org.springframework.stereotype.Repository;
// import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RestController;

//You can use any of them as they all are "components - bean" only... All have same meaning
@Component
//@Service
//@Repository
//@RestController
//@Controller

@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class StripePaymentService implements PaymentService {
    @Override
    public String pay(){
        String payment="Stripe Payment";
        System.out.println("Paying from : "+payment);
        return payment;
    }
}
