package com.boa.kyc.ribbon.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name="EKYC",configuration = FeignClientConfiguration.class)
@RibbonClient(name="EKYC")
public interface CustomerServiceProxy {

	@GetMapping("/getallcustomers")
	public ResponseEntity<String> retrieveAssets();
		
}
