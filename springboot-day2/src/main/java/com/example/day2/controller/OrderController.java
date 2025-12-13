package com.example.day2.controller;

import com.example.day2.model.OrderRequest;
import com.example.day2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public ResponseEntity<String> place(@RequestBody OrderRequest req) {
        return ResponseEntity.ok(service.placeOrder(req));
    }
}
