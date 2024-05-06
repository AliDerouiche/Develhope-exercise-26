package com.example.cors;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

   @CrossOrigin(origins = "http://localhost//9090")
    @GetMapping("/{name}")
    public String getName(@PathVariable("name") String name) {
        return name;
    }

    @PostMapping("/reverse/{name}")
    public String reverseName(@PathVariable("name") String name) {
        return new StringBuilder(name).reverse().toString();
    }
}