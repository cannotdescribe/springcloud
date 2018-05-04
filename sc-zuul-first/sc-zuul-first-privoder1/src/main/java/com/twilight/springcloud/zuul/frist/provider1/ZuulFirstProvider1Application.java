package com.twilight.springcloud.zuul.frist.provider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulFirstProvider1Application {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFirstProvider1Application.class, args);
    }
}
