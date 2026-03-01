package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        User user = new User(1, "Rahul", "Kozhikode");
        return user;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Rahul", "Kozhikode"));
        users.add(new User(2, "John", "Bangalore"));
        users.add(new User(3, "Sara", "Mumbai"));
        return users;
    }
}