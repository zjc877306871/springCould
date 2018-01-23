package com.zhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//作为服务的注解
@EnableEurekaServer
@SpringBootApplication
public class DiscoverEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverEurekaApplication.class, args);
		System.out.println("hello world!!!!");
	}
}
