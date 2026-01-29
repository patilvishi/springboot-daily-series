package com.example.day12.controller;

import com.example.day12.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    private final OrderService service;

    @GetMapping("/{id}")
    public String getOrder(@PathVariable Long id) {
        log.info("Received request to fetch order {}", id);
        return service.getOrder(id);
    }
}
