package com.colak.springtutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    // http://localhost:9001/user/normal
    @GetMapping("/normal")
    public ResponseEntity<String> normalUser() {
        return ResponseEntity.ok("Response from service1");
    }
}
