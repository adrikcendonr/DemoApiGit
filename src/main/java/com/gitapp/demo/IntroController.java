package com.gitapp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IntroController {
	
	@GetMapping("api/health")
	public String sayHealth() {
		return "API Health is decent.";
	}

}
