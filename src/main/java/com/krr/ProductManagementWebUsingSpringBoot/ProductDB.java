package com.krr.ProductManagementWebUsingSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    public Product findByName(String name);
}
