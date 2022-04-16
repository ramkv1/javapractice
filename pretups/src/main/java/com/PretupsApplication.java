package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
public class PretupsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PretupsApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
	
		
		
	}

}
