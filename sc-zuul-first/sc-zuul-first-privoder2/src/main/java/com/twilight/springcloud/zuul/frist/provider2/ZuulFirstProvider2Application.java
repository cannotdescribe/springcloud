package com.twilight.springcloud.zuul.frist.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZuulFirstProvider2Application {
    public static void main(String[] args) {
        SpringApplication.run(ZuulFirstProvider2Application.class, args);
    }
}
