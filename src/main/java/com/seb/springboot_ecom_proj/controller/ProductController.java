package com.seb.springboot_ecom_proj.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seb.springboot_ecom_proj.model.Product;
import com.seb.springboot_ecom_proj.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService service;
    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

}
