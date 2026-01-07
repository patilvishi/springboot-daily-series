package com.example.day9.controller;

import com.example.day9.dto.TransferRequest;
import com.example.day9.service.TransferService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transfer")
@RequiredArgsConstructor
public class TransferController {

    private final TransferService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String transfer(@Valid @RequestBody TransferRequest request) {
        service.transfer(request);
        return "Transfer successful";
    }
}
