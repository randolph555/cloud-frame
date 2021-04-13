package com.example.cloudserverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lijunke
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerProviderApplication.class, args);
    }

}
