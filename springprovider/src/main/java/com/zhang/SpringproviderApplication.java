package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "com.zhang.mapper")
public class SpringproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringproviderApplication.class, args);
	}
}
