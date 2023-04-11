package fr.rouen.stb23v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Stb23v1Application {

	public static void main(String[] args) {
		SpringApplication.run(Stb23v1Application.class, args);
		System.getProperties().put("server.port", 8100);
	}

}
