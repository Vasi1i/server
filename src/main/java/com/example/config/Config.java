package com.example.config;

import com.example.Regulator;
import com.example.RegulatorImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Regulator regulator() {
        return RegulatorImpl.getInstance();
    }
}
