package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
