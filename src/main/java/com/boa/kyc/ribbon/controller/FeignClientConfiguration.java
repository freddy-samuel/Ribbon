package com.boa.kyc.ribbon.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;

import feign.auth.BasicAuthRequestInterceptor;
 /*an IClientConfig, which stores client configuration for a client or load balancer,

an ILoadBalancer, which represents a software load balancer,

a ServerList, which defines how to get a list of servers to choose from,

an IRule, which describes a load balancing strategy, and

an IPing, which says how periodic pings of a server are performed.*/
 
@Configuration
public class FeignClientConfiguration {
	/*
	@Autowired
    IClientConfig ribbonClientConfig;
   
	
	@Autowired
	private LoadBalancerClient loadBalancer;
	
	@Autowired
	private ServerList<Server> serverList;
	
	public void getCustomer() throws RestClientException, IOException {
		
	List<Server>   servers=	serverList.getInitialListOfServers();
	                
//Server Instance
		ServiceInstance serviceInstance=loadBalancer.choose("KYCAppService");
		
		System.out.println(serviceInstance.getUri());
		
		String baseUrl=serviceInstance.getUri().toString();
		
		baseUrl=baseUrl+"/getall";
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response=null;
		try{
		response=restTemplate.exchange(baseUrl,
				HttpMethod.GET, getHeaders(),String.class);
		}catch (Exception ex)
		{
			System.out.println(ex);
		}
		System.out.println(response.getBody());
	}

	private static HttpEntity<?> getHeaders() throws IOException {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		return new HttpEntity<>(headers);
	}
	
*/
	
	@Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
         return new BasicAuthRequestInterceptor("user1", "user1@123");
    }
	/*
	 @Bean
	    public IPing ribbonPing(IClientConfig config) {
	        return new PingUrl();
	    }
	    @Bean
	    public IRule ribbonRule(IClientConfig config) {
	        return new AvailabilityFilteringRule();
	    }
	 */   
}