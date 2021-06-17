package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ProductRequestedServiceDAO",url="http://localhost:8005/")
public interface ProductRequestedServiceProxy {
	
	
	@GetMapping("/ProductsRequestedDAO/{requester}")
	public List getProductsRequested(@PathVariable String requester);
	
	@GetMapping("/ProductsApplicationsDAO/{owner}")
	public List getProductsApplications(@PathVariable String owner);
	
	
	@GetMapping("/setProductRequestEventDAO/{objectid}/{requester}/{typevent}")
	public void setProductRequestEvent(@PathVariable String objectid,@PathVariable String requester,
			@PathVariable String typevent);

}
