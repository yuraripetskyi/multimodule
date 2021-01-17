package com.multimodule.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.multimodule")
public class SampleAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleAdminApplication.class, args);
    }
}
