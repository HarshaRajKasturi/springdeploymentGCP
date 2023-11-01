package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDeploymentApplication {
	
	public static String getMessage() {

			return "Hello Guyz !!!";

		}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeploymentApplication.class, args);
		getMessage();
		
	}

}
