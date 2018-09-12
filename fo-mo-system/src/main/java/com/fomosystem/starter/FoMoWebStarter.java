package com.fomosystem.starter;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com.fomosystem")
public class FoMoWebStarter extends SpringBootServletInitializer {
	
	private static final Logger logger = LogManager.getLogger(FoMoWebStarter.class);

	   public FoMoWebStarter()
	   {
	       super();
	       setRegisterErrorPageFilter(false);
	   }

	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(FoMoWebStarter.class);
	    }

	public static void main(String args[]) {
		SpringApplication.run(FoMoWebStarter.class, args);
	}
}
