package com.example.day3.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderProcessor {

    private final PaymentClient paymentClient;
    private final InventoryClient inventoryClient;

    @PostConstruct
    public void init() {
        log.info("6️ OrderProcessor @PostConstruct - ready to process orders");
    }

    @PreDestroy
    public void destroy() {
        log.info("7️ OrderProcessor @PreDestroy - shutting down order processor");
    }
}
