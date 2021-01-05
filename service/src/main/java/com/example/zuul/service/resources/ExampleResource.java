package com.example.zuul.service.resources;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleResource {

	@GetMapping("/resource")
	public String getResource() {
		return "Returned from service resource";
	}
	
	@GetMapping("/health")
	public String getHealth() {
		return new Date().toString();
	}
	
}
