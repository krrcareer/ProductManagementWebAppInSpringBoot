package com.krr.ProductManagementWebUsingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    ProductDB productDB;

    public void addProduct(Product p){
        productDB.save(p);
    }

    public List<Product> getAllProducts(){
        return productDB.findAll();
    }

    public Product getProductByName(String name){
        return productDB.findByName(name);
    }

}
