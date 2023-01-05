package com.cicd.docker.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	public String hello() {
		return "Bonjour tout le Monde!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
