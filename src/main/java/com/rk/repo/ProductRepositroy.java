package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rk.model.Product;

public interface ProductRepositroy extends JpaRepository<Product, Integer>{

}
