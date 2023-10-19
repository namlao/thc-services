package com.thc.productservice.Mapper;

import com.thc.productservice.Entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();

    Product findById(String id);

    int addProduct(Product product);

    int count();

    int deleteById(String id);

    int deleteAll();

    int updateProduct(Product product);
}
