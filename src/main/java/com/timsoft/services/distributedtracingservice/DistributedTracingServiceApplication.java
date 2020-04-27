package com.timsoft.services.distributedtracingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class DistributedTracingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributedTracingServiceApplication.class, args);
	}

}
