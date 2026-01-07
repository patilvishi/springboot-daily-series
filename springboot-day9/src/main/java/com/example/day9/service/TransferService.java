package com.example.day9.service;

import com.example.day9.dto.TransferRequest;
import com.example.day9.entity.Account;
import com.example.day9.exception.AccountNotFoundException;
import com.example.day9.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TransferService {

    private final AccountRepository repository;

    @Transactional
    public void transfer(TransferRequest request) {

        Account from = repository.findById(request.getFromAccount())
                .orElseThrow(() -> new AccountNotFoundException(request.getFromAccount()));

        Account to = repository.findById(request.getToAccount())
                .orElseThrow(() -> new AccountNotFoundException(request.getToAccount()));

        if (from.getBalance() < request.getAmount()) {
            throw new IllegalStateException("Insufficient balance");
        }

        from.setBalance(from.getBalance() - request.getAmount());
        to.setBalance(to.getBalance() + request.getAmount());

        // Both updates succeed OR both rollback
        repository.save(from);
        repository.save(to);
    }
}
