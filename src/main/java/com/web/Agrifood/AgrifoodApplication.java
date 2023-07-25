package com.web.Agrifood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AgrifoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgrifoodApplication.class, args);
	}

}
