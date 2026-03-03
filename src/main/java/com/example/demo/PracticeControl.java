package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
