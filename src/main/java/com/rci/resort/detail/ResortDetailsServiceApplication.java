package com.rci.resort.detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ResortDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResortDetailsServiceApplication.class, args);
	}

}
