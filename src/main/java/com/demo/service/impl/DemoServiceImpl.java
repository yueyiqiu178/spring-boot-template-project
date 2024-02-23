package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public void insertProduct() {
		
		Product product = new Product();
		product.setName("Code");
		product.setPrice(100);
		
		productRepository.save(product);
	}
	
}
