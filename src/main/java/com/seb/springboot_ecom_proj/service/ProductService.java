package com.seb.springboot_ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seb.springboot_ecom_proj.model.Product;
import com.seb.springboot_ecom_proj.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;
    
    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProduct(int id){
        return repo.findById(id).orElse(new Product());
    }

}
