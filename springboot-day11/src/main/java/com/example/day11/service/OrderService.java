package com.example.day11.service;

import com.example.day11.dto.CreateOrderRequest;
import com.example.day11.entity.Order;
import com.example.day11.exception.OrderNotFoundException;
import com.example.day11.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public Order create(CreateOrderRequest request) {
        Order order = new Order();
        order.setProduct(request.getProduct());
        order.setQuantity(request.getQuantity());
        return repository.save(order);
    }

    public Order get(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
    }
}
