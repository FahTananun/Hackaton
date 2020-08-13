package com.hackaton.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/hackaton")
public class HackatonController {

    @GetMapping("/{text}")
    public ResponseEntity getText(@PathVariable("text") String text) {
        return ResponseEntity.ok(text);
    }
}
