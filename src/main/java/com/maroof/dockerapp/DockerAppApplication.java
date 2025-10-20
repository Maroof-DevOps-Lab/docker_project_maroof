package com.maroof.dockerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DockerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerAppApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Maroof, your Docker setup is working perfectly!";
    }
}
