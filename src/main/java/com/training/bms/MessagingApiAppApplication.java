package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MessagingApiAppApplication {
	
	@GetMapping("enjoyweekend")
	public String printGreetings() {
		return "HI DEVI";
	}

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("Welcome to Message API 5");
	
		
	}
	

}
