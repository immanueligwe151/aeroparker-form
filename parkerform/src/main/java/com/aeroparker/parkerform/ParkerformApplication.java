package com.aeroparker.parkerform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkerformApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ParkerformApplication.class);
        application.setRegisterShutdownHook(false); // Prevents auto shutdown
        application.run(args);
	}

}
