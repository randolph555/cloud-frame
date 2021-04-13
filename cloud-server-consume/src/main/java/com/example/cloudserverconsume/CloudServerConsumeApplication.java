package com.example.cloudserverconsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lijunke
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudServerConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerConsumeApplication.class, args);
    }

}
