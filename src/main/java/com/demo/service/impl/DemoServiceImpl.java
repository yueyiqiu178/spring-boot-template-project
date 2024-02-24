package com.demo.service.impl;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.repository.ProductRepositoryCustomized;
import com.demo.service.DemoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DemoServiceImpl implements DemoService {

	public static final Logger logger = LogManager.getLogger(DemoServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProductRepositoryCustomized productRepositoryCustomized;

    public void insertProduct() {

        Product product = new Product();
//		product.setId(1);
//		product.setName("Code");
//		product.setPrice(100);

//		for(int i=1;i<9;i++){
//			product = new Product();
//			product.setId(i*1000);
//			product.setName("Code"+i);
//			product.setPrice(i*7);
//			productRepository.save(product);
//		}




    }


    public void findAllProduct(){
//        List<Product> list = (List<Product>) productRepository.findAll();
//        for(Product p : list){
//            logger.info(p.getId());
//        }
        productRepositoryCustomized.query();
    }


    public Collection<Product> findProductPriceGrt100(){
        return productRepository.findProductPriceGrt100JPQL();
    }

}
