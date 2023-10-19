package com.thc.productservice.Repository.Impl;

import com.thc.productservice.Entity.Product;
import com.thc.productservice.Mapper.ProductMapper;
import com.thc.productservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public Product findById(String id) {
        return productMapper.findById(id);
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public int count() {
        return productMapper.count();
    }

    @Override
    public int deleteById(String id) {
        return productMapper.deleteById(id);
    }

    @Override
    public int deleteAll() {
        return productMapper.deleteAll();
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }
}
