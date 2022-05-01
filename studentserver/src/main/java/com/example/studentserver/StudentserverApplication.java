package com.example.studentserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentserverApplication.class, args);
    }

}
