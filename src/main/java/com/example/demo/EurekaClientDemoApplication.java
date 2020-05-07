package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientDemoApplication {
	
	@RequestMapping("/")
	public String index() {
		return "Hello Eureka...This is Eureka Clinet";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientDemoApplication.class, args);
	}

}
