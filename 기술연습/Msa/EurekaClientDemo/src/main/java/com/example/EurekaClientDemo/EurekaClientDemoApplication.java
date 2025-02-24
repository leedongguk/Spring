package com.example.EurekaClientDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientDemoApplication {
	// spring-start-web이 필수 (아마 마이크로서비스 라서 강제로 mvc, rest 서비스를 제공하게끔 만드는듯)
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDemoApplication.class, args);
	}
}
