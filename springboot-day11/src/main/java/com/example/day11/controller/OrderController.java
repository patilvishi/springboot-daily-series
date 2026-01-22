package com.example.day11.controller;

import com.example.day11.dto.CreateOrderRequest;
import com.example.day11.entity.Order;
import com.example.day11.service.OrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@Valid @RequestBody CreateOrderRequest request) {
        return service.create(request);
    }

    @GetMapping("/{id}")
    public Order get(@PathVariable Long id) {
        return service.get(id);
    }
}
