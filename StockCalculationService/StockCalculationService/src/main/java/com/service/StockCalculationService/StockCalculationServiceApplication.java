package com.service.StockCalculationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients			//for feign client
@EnableDiscoveryClient		//foe eureka server discovery
public class StockCalculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockCalculationServiceApplication.class, args);
	}

}
