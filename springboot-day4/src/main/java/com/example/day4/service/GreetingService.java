package com.example.day4.service;

import com.example.day4.config.AppProperties;
import com.example.day4.config.FeatureProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final AppProperties appProperties;
    private final FeatureProperties featureProperties;

    public String greet() {

        String base = "Welcome to " + appProperties.getName()
                + " running in " + appProperties.getEnvironment()
                + " environment.";

        if (featureProperties.isNewDashboardEnabled()) {
            base += " New Dashboard is ENABLED.";
        } else {
            base += " New Dashboard is DISABLED.";
        }

        return base;
    }
}
