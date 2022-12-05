package com.example.productApp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/")
    public String homePage(){
        return "Welcome to product app home page";
    }
    @PostMapping("/add")
    public String addProduct(){
        return "Welcome to product Add page";
    }
    @PostMapping("/search")
    public String searchProduct(){
        return "Welcome to the page of product search";
    }
}
