package com.example.day3.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class InventoryClient {

    public InventoryClient() {
        log.info("2️ InventoryClient constructor called");
    }

    @PostConstruct
    public void init() {
        log.info("5️ InventoryClient @PostConstruct - loading inventory cache");
    }

    @PreDestroy
    public void destroy() {
        log.info("8️ InventoryClient @PreDestroy - clearing inventory cache");
    }
}
