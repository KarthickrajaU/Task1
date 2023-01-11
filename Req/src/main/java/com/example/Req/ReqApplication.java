package com.example.Req;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ReqApplication  extends SpringBootServletInitializer {

	
	@Autowired
	CustomerserviceImpl customerservice;
	
	public static void main(String[] args) {
		SpringApplication.run(ReqApplication.class, args);
	}

	@CrossOrigin(origins = "http://localhost:8080")
	
	@PostMapping("/add")
	public String index(customerModel customerModel){
		customerservice.saveCustomer(customerModel);
		return "user added successfully";
	}

}
