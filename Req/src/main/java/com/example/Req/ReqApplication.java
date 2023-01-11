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

	public static void main(String[] args) {
		SpringApplication.run(ReqApplication.class, args);
	}

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/add")
	public String index(){
		return "welcome";
	}

}
