package com.example.day7.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SearchResponse {
    private String query;
    private int page;
    private int size;
    private String clientType;
    private String responseFormat;
}
