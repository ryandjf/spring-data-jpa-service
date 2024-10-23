package com.example.controller;

import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(value = "pageable")
    public ResponseEntity<?> getPersonsPageable(
            @RequestParam(defaultValue = "0") final Integer pageNumber,
            @RequestParam(defaultValue = "10") final Integer pageSize) {
        return ResponseEntity.ok(repository.findAll(PageRequest.of(pageNumber, pageSize)));
    }

    @GetMapping
    public ResponseEntity<?> getPersons() {
        return ResponseEntity.ok(repository.findAll());
    }
}
