package com.twilight.springcloud.first.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFirstStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFirstStartApplication.class, args);
	}
}
