package com.microservice.email_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @PostMapping("/send")
    public String sendEmail(@RequestBody String message){
        System.out.println("Email Service Received Message : " + message);
        return "Email Sent Successfully";
    }
}
