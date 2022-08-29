package com.howathon.ps.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class LoginSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSvcApplication.class, args);
	}

}
