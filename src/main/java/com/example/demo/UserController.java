package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<UserTest> allUsers() {
        return repo.findAll();
    }

    @PostMapping
    public UserTest saveUser(@RequestBody UserTest user) {
        return repo.save(user);
    }
}