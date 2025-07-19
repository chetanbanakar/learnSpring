package com.HelloWorldAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/helloworld")
    public String hello() {
        return "Hello World";
    }
}
