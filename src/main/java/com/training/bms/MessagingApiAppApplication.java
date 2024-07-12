package com.training.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApiAppApplication.class, args);
		System.out.println("Welcome to Message API 4");
		printGreetings();
		
	}
	public static void printGreetings() {
		System.out.println("Hi Oracle !!");
	}

}
