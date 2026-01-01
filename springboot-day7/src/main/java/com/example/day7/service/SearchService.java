package com.example.day7.service;

import com.example.day7.dto.SearchResponse;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public SearchResponse search(
            String query,
            int page,
            int size,
            String clientType,
            String format
    ) {
        return new SearchResponse(query, page, size, clientType, format);
    }
}
