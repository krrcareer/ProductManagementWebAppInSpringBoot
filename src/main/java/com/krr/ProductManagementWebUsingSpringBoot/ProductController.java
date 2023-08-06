package com.krr.ProductManagementWebUsingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductServices services;

    @PostMapping("/product")
    public void addProductController(@RequestBody Product p){
        services.addProduct(p);
    }
    @GetMapping("/products")
    public List<Product> getAllProductsController(){
        return services.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getProductByNameController(@PathVariable String name){
        return services.getProductByName(name);
    }


}
