package com.xiaobei.springboot.admin.demo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminSampleAdminMyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminSampleAdminMyApplication.class, args);
	}

}
