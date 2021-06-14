package com.tuten.utc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tuten.utc.controllers"})
public class UtcApplication {
    public static void main(String[] args) {
        SpringApplication.run(UtcApplication.class, args);
    }
}
