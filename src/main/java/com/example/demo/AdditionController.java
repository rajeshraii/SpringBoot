package com.example.demo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    
    @GetMapping("/add")
    public Addition addData(){
        Addition add = new Addition(10,30);
        return add;
    }

    @GetMapping("/addmore")
    public List<Addition> getMoreData(){
        List<Addition> addmore = new ArrayList<>();
        addmore.add(new Addition(40,90));
        addmore.add(new Addition(60,100));
        addmore.add(new Addition(1000,100000));
        addmore.add(new Addition(75,85));
        addmore.add(new Addition(98,187));
        return addmore;
    }
}