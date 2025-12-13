package com.example.day2.service.impl;

import com.example.day2.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {

    @Override
    public String pay(double amount) {
        return "Paid ₹" + amount + " using Stripe.";
    }
}
