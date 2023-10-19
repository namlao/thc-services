package com.thc.productservice.Repository;

import com.thc.productservice.Entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();

    Product findById(String id);

    int addProduct(Product product);

    int count();

    int deleteById(String id);

    int deleteAll();

    int updateProduct(Product product);
}
