package com.example.controller;

import com.example.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    private CartRepository repository;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }
}
