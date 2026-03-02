package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    
    @GetMapping("/add")
    public Addition addData(){
        Addition add = new Addition(10,30);
        return add;
    }
}
