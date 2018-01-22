package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DiscoverEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverEurekaApplication.class, args);
		System.out.println("hello world!!!!");
	}
}
