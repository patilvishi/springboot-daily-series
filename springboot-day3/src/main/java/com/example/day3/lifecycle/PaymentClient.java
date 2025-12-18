package com.example.day3.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PaymentClient {

    public PaymentClient() {
        log.info("1 PaymentClient constructor called");
    }

    @PostConstruct
    public void init() {
        log.info("4 PaymentClient @PostConstruct - initializing payment connection");
    }

    @PreDestroy
    public void destroy() {
        log.info("9 PaymentClient @PreDestroy - closing payment connection");
    }
}
