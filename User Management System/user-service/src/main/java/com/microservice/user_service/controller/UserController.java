package com.microservice.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private WebClient.Builder webclientBuilder;

    @PostMapping("/add")
    public String addUser(@RequestBody String user){
        // db saving logic
        String response = webclientBuilder.build()
                .post()
                .uri("http://email-service/email/send")
                .bodyValue("Email triggered for " + user)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return "User Added Successfully " + response;
    }
}
