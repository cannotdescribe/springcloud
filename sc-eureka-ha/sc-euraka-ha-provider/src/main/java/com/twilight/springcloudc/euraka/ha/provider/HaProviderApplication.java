package com.twilight.springcloudc.euraka.ha.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaProviderApplication.class, args);
    }
}
