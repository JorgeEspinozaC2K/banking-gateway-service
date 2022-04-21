package com.banking.gateway.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankingGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingGatewayServiceApplication.class, args);
	}

}
