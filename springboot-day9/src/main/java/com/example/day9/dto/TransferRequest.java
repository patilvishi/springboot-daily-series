package com.example.day9.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TransferRequest {

    @NotNull
    private Long fromAccount;

    @NotNull
    private Long toAccount;

    @Min(1)
    private double amount;
}
