package com.example.pets.controller;

import com.example.pets.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/user")
public class Authentication {

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        log.info("User registered: " + user.getUsername());
        return ResponseEntity.ok("{\"message\": \"Register successful\"}");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        log.info("Logging in user: " + user.getUsername());
        return ResponseEntity.ok("{\"message\": \"Login successful\"}");
    }
}
