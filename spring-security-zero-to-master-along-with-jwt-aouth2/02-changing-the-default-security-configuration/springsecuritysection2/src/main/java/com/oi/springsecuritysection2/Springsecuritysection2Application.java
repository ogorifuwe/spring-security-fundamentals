package com.oi.springsecuritysection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan(value = "com.oi.controller"), @ComponentScan(value = "com.oi.config") })
public class Springsecuritysection2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritysection2Application.class, args);
	}

}
