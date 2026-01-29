package com.example.day12.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    public String getOrder(Long id) {
        log.debug("Fetching order from service layer");
        if (id <= 0) {
            log.warn("Invalid order id received: {}", id);
            throw new IllegalArgumentException("Invalid order id");
        }
        return "Order-" + id;
    }
}
