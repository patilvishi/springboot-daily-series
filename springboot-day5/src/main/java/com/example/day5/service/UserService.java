package com.example.day5.service;

import com.example.day5.dto.CreateUserRequest;
import com.example.day5.dto.UserResponse;
import com.example.day5.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    private final Map<Long, UserResponse> store = new HashMap<>();
    private final AtomicLong idGen = new AtomicLong(1);

    public UserResponse create(CreateUserRequest req) {
        Long id = idGen.getAndIncrement();
        UserResponse user = new UserResponse(id, req.getName(), req.getEmail());
        store.put(id, user);
        return user;
    }

    public UserResponse get(Long id) {
        UserResponse user = store.get(id);
        if (user == null) {
            throw new UserNotFoundException("User not found: " + id);
        }
        return user;
    }
}
