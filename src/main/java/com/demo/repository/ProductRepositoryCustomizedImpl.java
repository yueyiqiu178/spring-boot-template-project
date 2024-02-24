package com.demo.repository;

import com.demo.vo.ProductVo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StringType;
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

        StringBuilder sb = new StringBuilder();
        sb.append(" select price as qPrice from product ");

        //String sql = "select * from product";
        Query query = entityManager.createNativeQuery(sb.toString());
        query.unwrap(NativeQueryImpl.class)
                .setResultTransformer(Transformers.aliasToBean(ProductVo.class))
                .addScalar("qPrice", StringType.INSTANCE);


//        List<Object[]> players = query.getResultList();
//
//        for(Object[] Objects : players){
//
//            logger.info(Objects[0]);
//            logger.info(Objects[1]);
//            logger.info(Objects[2]);
//
//        }

        List<ProductVo> players = query.getResultList();

        for(ProductVo p : players){
            logger.info(p.getqPrice());
        }

    }

}
