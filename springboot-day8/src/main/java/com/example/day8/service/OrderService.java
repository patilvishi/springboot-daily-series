package com.example.day8.service;

import com.example.day8.dto.CreateOrderRequest;
import com.example.day8.dto.OrderResponse;
import com.example.day8.entity.Order;
import com.example.day8.exception.OrderNotFoundException;
import com.example.day8.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public OrderResponse create(CreateOrderRequest req) {
        Order order = new Order();
        order.setProduct(req.getProduct());
        order.setQuantity(req.getQuantity());
        order.setStatus(Order.OrderStatus.CREATED);

        Order saved = repository.save(order);
        return new OrderResponse(saved.getId(), saved.getStatus().name());
    }

    public OrderResponse get(Long id) {
        Order order = repository.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
        return new OrderResponse(order.getId(), order.getStatus().name());
    }
}
