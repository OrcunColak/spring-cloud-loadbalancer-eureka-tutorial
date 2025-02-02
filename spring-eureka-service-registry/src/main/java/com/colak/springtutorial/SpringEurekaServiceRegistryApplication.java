package com.colak.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServiceRegistryApplication.class, args);
	}

}
