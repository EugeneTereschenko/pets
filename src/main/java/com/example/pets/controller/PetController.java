package com.example.pets.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pets")
public class PetController {

    @GetMapping
    public ResponseEntity<String> getString() {
        return ResponseEntity.ok("Hello, World!");
    }

    @PostMapping
    public ResponseEntity<String> postString() {
        return ResponseEntity.ok("Posted!");
    }
}
