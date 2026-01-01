package com.example.day7.controller;

import com.example.day7.dto.SearchResponse;
import com.example.day7.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchService service;

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE })
    public SearchResponse search(
            @RequestParam String q,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestHeader(value = "X-Client-Type", defaultValue = "web") String clientType,
            @RequestHeader(value = "Accept", defaultValue = "application/json") String format
    ) {
        return service.search(q, page, size, clientType, format);
    }
}
