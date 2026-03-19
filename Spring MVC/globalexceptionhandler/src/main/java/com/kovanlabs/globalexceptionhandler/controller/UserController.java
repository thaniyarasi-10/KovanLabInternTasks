package com.kovanlabs.globalexceptionhandler.controller;

import com.kovanlabs.globalexceptionhandler.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public String test() {
        return "Users endpoint working";
    }

    @PostMapping("/add")
    public String createUser(@RequestBody UserModel user) {
        return "User created: " + user.getName();
    }

    @GetMapping("/{name}")
    public UserModel getUser(@PathVariable String name) {
        return new UserModel(name, name + "@mail.com", 25);
    }
}