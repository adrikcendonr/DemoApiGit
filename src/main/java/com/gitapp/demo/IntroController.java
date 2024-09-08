package com.gitapp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class IntroController {
	
	@GetMapping("api/health")
	public String sayHealth() {
		return "API Health is decent.";
	}
	
	@GetMapping("api/status")
	public String sayStatus() {
		return "API status is stable for now.";
	}
	
	@GetMapping("api")
	public String showAPI() {
		return "THIS IS THE API FOR THE GIT CONTROLS. WELCOME.";
	}


}
