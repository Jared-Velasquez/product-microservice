package com.jvel.microservices.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Lombok did not compile correctly; go into IntelliJ IDEA settings and set the annotation processor
// product-service profile to obtain processors via the classpath.
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
