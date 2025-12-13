package com.example.day2.service;

import com.example.day2.model.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrderService {

    // Auto-wires all PaymentService beans into a Map
    private final Map<String, PaymentService> paymentServices;

    public String placeOrder(OrderRequest order) {

        PaymentService ps = paymentServices.get(order.getPaymentMode());

        if (ps == null) {
            throw new IllegalArgumentException("Invalid payment method: " + order.getPaymentMode());
        }

        return ps.pay(order.getAmount());
    }
}
