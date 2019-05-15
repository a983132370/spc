package com.wm.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@RefreshScope
@RequestMapping("config")
@EnableDiscoveryClient
public class NacosApplication {
	//https://nacos.io/zh-cn/docs/quick-start.html
	public static void main(String[] args) {
		SpringApplication.run(NacosApplication.class, args);
	}
	@NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
	private boolean useLocalCache;

	@GetMapping(value = "/get")
	public boolean get() {
		return useLocalCache;
	}
}
