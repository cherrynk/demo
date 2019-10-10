/*package com.nk.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
@RibbonClient(name="HELLO-SEVER",configuration=MyRibbonConfiguration.class)
public class ConsumerApplication {
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(Environment env) {
		HttpComponentsClientHttpRequestFactory 
			httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
			int readTimeout = 
			env.getProperty("ribbon.ReadTimeout",int.class,40000);
			httpRequestFactory.setReadTimeout(readTimeout);
		return new RestTemplate(httpRequestFactory);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
*/