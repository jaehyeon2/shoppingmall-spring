package com.example.shoppingmallspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ShoppingmallSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingmallSpringApplication.class, args);
	}

}
