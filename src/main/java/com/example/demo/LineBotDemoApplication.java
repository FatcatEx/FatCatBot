package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/robot")
@SpringBootApplication
public class LineBotDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineBotDemoApplication.class, args);
	}
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("Hello JAVA", HttpStatus.OK);
	}

}
