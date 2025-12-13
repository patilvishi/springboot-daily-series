package com.example.day2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private String productId;
    private double amount;
    private String paymentMode; // stripe or razorpay
}
