package com.example.demo_microservice_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoMicroserviceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMicroserviceClientApplication.class, args);
    }

}
