package com.beast.practice.controller;

import com.beast.practice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(){
        return new User("Beast45",22,889985632,"India");
    }
}
