package com.nk.test.test;

import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController			
public class HelloController {
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private DiscoveryClient client;
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String index(String name) {
		try {
			Thread.sleep(4400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*ServiceInstance ins = client.g
		logger.info("/hello,host:"+ins.getHost()+"service_id:"+ins.getServiceId());*/
		return name;
	}
}
