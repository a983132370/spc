package com.wm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wm",defaultConfiguration = FeignClientsConfiguration.class)
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		System.out.println("测试访问地址: http://localhost:5002/order/getUserList");

	}

}
