package com.starkinsure.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class StarkinsurePaymentServiceApplication {

	static {
		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_NAME", dotenv.get("DB_NAME"));
		System.setProperty("DB_HOST", dotenv.get("DB_HOST"));
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_PORT", dotenv.get("DB_PORT"));
		System.setProperty("DB_DRIVER", dotenv.get("DB_DRIVER"));
		System.setProperty("DB_DIALECT", dotenv.get("DB_DIALECT"));
	}

	public static void main(String[] args) {
		SpringApplication.run(StarkinsurePaymentServiceApplication.class, args);
		System.out.println("Starkinsure Payment Service Application is currently running on port 5004");
	}

}
