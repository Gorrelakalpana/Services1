package com.example.customer.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;

public class CustomerRetryClientConfig {
    @Bean
    public Retryer clientServiceRetryer(){
        return null ;
    }
}
