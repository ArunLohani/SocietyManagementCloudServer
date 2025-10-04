package com.project.societyManagementCloudServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SocietyManagementCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocietyManagementCloudServerApplication.class, args);
	}

}
