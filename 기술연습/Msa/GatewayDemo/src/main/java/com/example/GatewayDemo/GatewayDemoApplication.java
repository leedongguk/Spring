package com.example.GatewayDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayDemoApplication.class, args);
	}
}
