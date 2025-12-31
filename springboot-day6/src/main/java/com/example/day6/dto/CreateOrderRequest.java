package com.example.day6.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateOrderRequest {

    @NotBlank
    private String product;

    @Min(1)
    private int quantity;
}
