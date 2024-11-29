package com.codeq.springboot_k8s_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootK8sDemoApplication {

	@GetMapping("/message")
	public String displayMessage(){
		return "Deployment with kubernetes!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
