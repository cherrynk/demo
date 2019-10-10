package com.nk.test.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class HelloService {
	
	@Autowired
	RestTemplate restTemplate;
	

	@HystrixCommand(fallbackMethod="helloFallback")
	public String helloService() {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("name", "1111");
		ResponseEntity<String> responseEntity = restTemplate
				.getForEntity("http://HELLO-SEVER/hello?name={1}", String.class,  "nk");
		String body = responseEntity.getBody();
		return body;
	}
	
	public String helloFallback() {
		return "error";
	}
}
