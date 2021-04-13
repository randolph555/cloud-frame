package com.example.cloudserverconsume.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author lijunke
 */
@Slf4j
@RestController
public class ApiController {


    @GetMapping("/test/info")
    public Mono<String> test() {
        return Mono.just("cloud-server-consume  7070 success...");
    }
}
