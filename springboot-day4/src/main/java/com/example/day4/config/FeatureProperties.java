package com.example.day4.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "feature")
public class FeatureProperties {

    private boolean newDashboardEnabled;
    private boolean betaMode;
}
