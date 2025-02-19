package com.example.pets.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Pet {

    @GetMapping
    public ResponseEntity<String> getPetFromProject(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/pet")
    public ResponseEntity<String> getPet(){
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping
    public ResponseEntity<String> postPet(){
        return ResponseEntity.ok("Hello World");
    }
}
