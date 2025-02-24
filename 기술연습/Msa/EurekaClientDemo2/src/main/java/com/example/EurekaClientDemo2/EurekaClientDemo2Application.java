package com.example.EurekaClientDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDemo2Application.class, args);
	}

}
