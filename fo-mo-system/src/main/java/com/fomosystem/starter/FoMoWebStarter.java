package com.fomosystem.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.fomosystem")
public class FoMoWebStarter extends SpringBootServletInitializer {

	public static void main(String args[]) {
		SpringApplication.run(FoMoWebStarter.class, args);
	}
}
