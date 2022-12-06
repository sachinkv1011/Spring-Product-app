package com.example.productApp_backend.controller;


import com.example.productApp_backend.dao.ProductDao;
import com.example.productApp_backend.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String homePage(){
        return "Welcome to product app home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addProduct(@RequestBody ProductModel p){
        dao.save(p);
        return "Welcome to product Add page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/search")
    public String searchProduct(){
        return "Welcome to the page of product search";
    }

    @PostMapping("/edit")
    public String editProduct(){
        return "Welcome to the page of product edit";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<ProductModel> viewAllProduct(){
        return (List<ProductModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public String deleteProduct(){
        return "Please delete the product you want";
    }
}
