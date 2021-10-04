package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//@ComponentScan(basePackages="app.demo")
public class SpringAngularJWTBackend {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularJWTBackend.class, args);
	}
	@Bean
	public PasswordEncoder encoder() {
	 return new BCryptPasswordEncoder();
	}

}

