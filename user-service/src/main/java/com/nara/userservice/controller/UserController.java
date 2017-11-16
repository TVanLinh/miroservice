package com.nara.userservice.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "hello user";
    }

//    @Configuration
//    class Config {
//
//        @LoadBalanced
//        @Bean
//        public RestTemplate restTemplate() {
//            return new RestTemplate();
//        }
//
//    }
}
