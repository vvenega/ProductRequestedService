package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
public class ProductRequestedServiceController {

	//private static final String VALID_CUSTOMER = "http://192.168.1.66:4200";
	
	private static final String VALID_CUSTOMER = "*";
	@Autowired
	private ProductRequestedServiceProxy proxy;
	
	@Autowired
	private KafkaServiceProxy kafkaproxy;
	
	
	@CrossOrigin(origins = VALID_CUSTOMER)
	@GetMapping("/ProductsRequested/{requester}")
	public List getProductRequested(@PathVariable String requester) {
		
		List response =proxy.getProductsRequested(requester);
		
		kafkaproxy.setEvent(requester, 0.0, "N-A", 
				"N-A", "N-A", requester, 
				0, "PRODUCT_REQUESTED",false,false);
		
		System.err.println(response.size());
		return response;
	}
	
	@CrossOrigin(origins = VALID_CUSTOMER)
	@GetMapping("/ProductsApplications/{owner}")
	public List getProductApplications(@PathVariable String owner) {
		
		List response =proxy.getProductsApplications(owner);
		
		//System.err.println("Response:"+response.getMap());
		System.err.println("Response size:"+response.size());
		
		kafkaproxy.setEvent(owner, 0.0, "N-A", 
				"N-A", "N-A", owner, 
				0, "PRODUCT_APPLICATIONS",false,false);
		
		return response;
	}
	
	
	@CrossOrigin(origins = VALID_CUSTOMER)
	@GetMapping("/setProductRequestEvent/{objectid}/{requester}/{typevent}/{user}")
	public void setContactRecord(@PathVariable String objectid,@PathVariable String requester,
			@PathVariable String typevent,@PathVariable String user) {
		
		proxy.setProductRequestEvent(objectid, requester, typevent);
        
		
		
		kafkaproxy.setEvent(user, 0.0, "N-A", 
				"N-A", "N-A", user, 
				0,typevent,false,false);
		
		
	}
	
	
}
