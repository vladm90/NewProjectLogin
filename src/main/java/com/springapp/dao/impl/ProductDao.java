package com.springapp.dao.impl;

import com.springapp.dao.IProductDao;
import com.springapp.dao.IUserDao;
import com.springapp.model.Product;
import com.springapp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import java.util.List;

//import com.springapp.model.ReadOnlyConnection;

/**
 * Created with InteliJ IDEA
 * User: vmotoroiu
 * Date: 14.03.2016
 * Time: 16:29
 */
@Repository("productDao")
public class ProductDao extends GenericDao<Product, Long> implements IProductDao{

    public ProductDao() {
        super(Product.class);
    }

    @Override
    public List<Product> getProducts() {
        String sql = "SELECT p FROM Product p WHERE p.enabled=true";
        Query query = entityManager.createQuery(sql);

        return query.getResultList();
    }




}
