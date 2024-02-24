package com.demo.repository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductRepositoryCustomizedImpl implements ProductRepositoryCustomized{

    public static final Logger logger = LogManager.getLogger(ProductRepositoryCustomizedImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    public void query(){

        String sql = "select * from product";
        Query query = entityManager.createNativeQuery(sql);

        List<Object[]> players = query.getResultList();

        for(Object Object : players){

        }

        logger.info("queryqueryquery");
        logger.info(players);

    }

}
