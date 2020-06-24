package com.weatherdetails.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Configuration
public class Util {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
