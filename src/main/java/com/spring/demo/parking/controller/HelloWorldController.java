package com.spring.demo.parking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(Map<String, String> model) {
        model.put("msg" , "Hello World");
        return "hello-view";
    }
}
