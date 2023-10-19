package com.thc.productservice.Service.Impl;

import com.thc.productservice.Args.AddProductArgs;
import com.thc.productservice.Args.UpdateProductArgs;
import com.thc.productservice.Entity.Product;
import com.thc.productservice.Repository.ProductRepository;
import com.thc.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(AddProductArgs cart) {
        Product product = new Product(cart.getName(),cart.getAvatar(),cart.getPrice(),cart.getCateId());
        String id = product.getId();
        productRepository.addProduct(product);
        return this.getProduct(id);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(UpdateProductArgs cart) {
        return null;
    }

    @Override
    public int deleteProduct(String id) {
        return 0;
    }

    @Override
    public int deleteProductAll() {
        return 0;
    }

    @Override
    public int count() {
        return 0;
    }
}
