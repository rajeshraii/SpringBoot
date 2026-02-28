package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "Stranger") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/bye")
    public String sayBye(@RequestParam(defaultValue = "Stranger") String name) {
        return "Bye, " + name + "!";
    }
}