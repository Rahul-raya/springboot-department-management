package com.example.Springbootpractice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;


@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return welcomeMessage;
    }   
}
