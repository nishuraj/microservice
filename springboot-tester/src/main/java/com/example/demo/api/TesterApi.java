package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome-app")
public class TesterApi {
	@GetMapping(value = "welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}
}
