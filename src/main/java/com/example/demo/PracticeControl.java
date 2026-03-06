package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;

@RestController
public class PracticeControl {
    @GetMapping("/practice")
    public List<Practice> getPractice() {
        List<Practice> practices = new ArrayList<>();
        practices.add(new Practice("Rajesh", 20, 90));
        practices.add(new Practice("Bob", 25, 89));
        practices.add(new Practice("Prakash", 20, 35));
        return practices;
    }

    @PostMapping("/practice")
    public Practice newPractice(@RequestBody Practice practice) {
        return practice;
    }

    @PostMapping("/practice/bulk")
    public List<Practice> newPractices(@RequestBody List<Practice> practice) {
        return practice;
    }
}
