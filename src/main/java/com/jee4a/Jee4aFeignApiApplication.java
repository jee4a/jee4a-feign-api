package com.jee4a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.jee4a")
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Jee4aFeignApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Jee4aFeignApiApplication.class, args);
	}
}
