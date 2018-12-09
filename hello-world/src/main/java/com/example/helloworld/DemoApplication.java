package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.*;


@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping(value="/hello")
	public String getMethodName() {
		Company company = new Company();
		return company.getName();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
