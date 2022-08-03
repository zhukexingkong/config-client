package com.learn.spring.cloud.config.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "data")
public class GitConfig {
    private String env;

    private UserInfo user;
}
