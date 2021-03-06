package com.example.demo_microservice_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageService {

    public static void main(String[] args) {
        SpringApplication.run(ImageService.class, args);
    }

}
