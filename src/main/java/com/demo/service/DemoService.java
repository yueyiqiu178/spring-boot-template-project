package com.demo.service;

import com.demo.entity.Product;

import java.util.Collection;

public interface DemoService {

    public void insertProduct();

    public Collection<Product> findProductPriceGrt100();

    public void findAllProduct();

}
