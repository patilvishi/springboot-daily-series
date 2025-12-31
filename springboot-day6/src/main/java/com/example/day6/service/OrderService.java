package com.example.day6.service;

import com.example.day6.dto.CreateOrderRequest;
import com.example.day6.dto.OrderResponse;
import com.example.day6.exception.InvalidOrderException;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderService {

    private final AtomicLong idGen = new AtomicLong(1000);

    public OrderResponse create(CreateOrderRequest req) {
        if (req.getQuantity() <= 0) {
            throw new InvalidOrderException("Quantity must be greater than zero");
        }
        return new OrderResponse(idGen.incrementAndGet(), "CREATED");
    }
}
