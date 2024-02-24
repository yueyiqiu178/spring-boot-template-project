package com.demo.repository;

import com.demo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

    @Query(value = "SELECT * FROM product p WHERE p.price > 100", nativeQuery = true)
    Collection<Product> findProductPriceGrt100();

    @Query("SELECT p FROM Product p WHERE p.price > 100")
    Collection<Product> findProductPriceGrt100JPQL();

}
