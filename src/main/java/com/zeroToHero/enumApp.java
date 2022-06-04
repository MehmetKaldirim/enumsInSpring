package com.zeroToHero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class enumApp implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(enumApp.class, args);
	}

}
